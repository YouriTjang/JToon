package nl.hr.cmi.inf;

import com.fasterxml.jackson.databind.ObjectMapper;
import nl.hr.cmi.inf.Entities.Agreement;
import nl.hr.cmi.inf.Entities.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Optional;

@PropertySource("classpath:application.properties")
@SpringBootApplication
public class JtoonApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(JtoonApplication.class);

    @Value("${toonapi.username}")
    String USERNAME;

    @Value("${toonapi.password}")
    String PASSWORD;

    @Value("${toonapi.apitoken}")
    String APITOKEN;

    public static void main(String[] args) {
        SpringApplication.run(JtoonApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        disableCertificateValidation();

        Token token = getToken();
        System.out.println(token);

        System.out.println(getAgreements(token));
    }

    public Agreement getAgreements(Token token) throws Exception {
        URL url = new URL("https://api.toonapi.com/toon/api/v1/agreements");
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        String bearer = "Bearer " + token.getAccess_token();
        con.addRequestProperty("Authorization", bearer);

//        con.setDoInput(true);
//        con.setDoOutput(true);

//        con.setRequestProperty( "Content-type", "application/x-www-form-urlencoded");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        in.lines().forEach(System.out::println);
        in.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        ObjectMapper mapper = new ObjectMapper();
        return null;//mapper.readValue(result, Agreement.class);
    }

    public Token getToken() throws Exception {
        String data = String.format("grant_type=password&username=%s&password=%s", USERNAME, PASSWORD);

        URL url = new URL("https://api.toonapi.com/token");
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoInput(true);
        con.setDoOutput(true);

        String basicAuth = "Basic " + APITOKEN;
        con.addRequestProperty("Authorization", basicAuth);
        con.addRequestProperty("Accept", "application/json");
        con.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

        con.getOutputStream().write(data.getBytes("UTF-8"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String result = reader.lines().reduce("", String::concat);

        System.out.println(result);

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(result, Token.class);
    }


    //Trust any certificate
    //https://gist.github.com/michalbcz/4170520
    public void disableCertificateValidation() {
        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
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
