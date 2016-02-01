package nl.hr.cmi.inf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

@SpringBootApplication
public class JtoonApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(JtoonApplication.class);



    public static void main(String[] args) {
        SpringApplication.run(JtoonApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        try {
            String data = String.format("grant_type=password&username=%s&%s", USERNAME, PASSWORD);

            disableCertificateValidation();

            URL url = new URL("https://api.toonapi.com/token");
            HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setDoInput(true);
            con.setDoOutput(true);

            String basicAuth = "Basic " + APITOKEN;
            con.addRequestProperty ("Authorization", basicAuth);
            con.addRequestProperty("Accept", "application/json");
            con.setRequestProperty( "Content-type", "application/x-www-form-urlencoded");

            System.out.println("----------------------------");
            System.out.println(con);

            con.getOutputStream().write(data.getBytes("UTF-8"));

            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));


            System.out.println("token:");
            reader.lines().forEach(System.out::println);

        } catch (Exception e) {
            String errMsg = "There was an error: " + e.getMessage();
            System.err.println(errMsg);
            e.printStackTrace();
        }
    }


    //Trust any certificate
    //https://gist.github.com/michalbcz/4170520
//    public static void test(String [] args) throws Exception {
//        // configure the SSLContext with a TrustManager
//        SSLContext ctx = SSLContext.getInstance("SSL");
//        ctx.init(new KeyManager[0], new TrustManager[] {new DefaultTrustManager()}, new SecureRandom());
//        SSLContext.setDefault(ctx);
//
////        URL url = new URL("https://api.toonapi.com/toon/api/v1/agreements");
//        URL url = new URL("https://jsonplaceholder.typicode.com/posts/1/comments");
//        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
//        conn.setRequestMethod("GET");
//        String userpass = username + ":" + password;
//        String basicAuth = "Basic " + new String(new Base64().encode(userpass.getBytes()));
//        con.setRequestProperty ("Authorization", basicAuth);
//
//        con.addRequestProperty("Accept", "application/json");
//        con.getOutputStream().write(data.getBytes("UTF-8"));
//
//        conn.setHostnameVerifier((arg0, arg1) -> true);
//
//        System.out.println(conn.getResponseCode());
//        System.out.println(conn.getContent());
//
//        conn.disconnect();
//    }
//
//    private static class DefaultTrustManager implements X509TrustManager {
//
//        @Override
//        public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
//
//        @Override
//        public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
//
//        @Override
//        public X509Certificate[] getAcceptedIssuers() {
//            return null;
//        }
//    }

    public void disableCertificateValidation() {
        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }

            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {

            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {

            }
        }};

        // Ignore differences between given hostname and certificate hostname
        HostnameVerifier hv = new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };

        // Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(hv);
        } catch (Exception e) {
            // Do nothing
            System.err.println("You've got trust issues" + e);
        }
    }

}
