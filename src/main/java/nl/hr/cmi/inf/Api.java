package nl.hr.cmi.inf;

import com.fasterxml.jackson.databind.ObjectMapper;
import nl.hr.cmi.inf.dtos.*;
import org.springframework.util.Base64Utils;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Api {



    public States getTemperatureStates(Token token) throws Exception{
        BufferedReader in = null;
        try {
            URL url = new URL("https://api.toonapi.com/toon/api/v1/temperature/states");
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Bearer " + token.getAccess_token());
            con.setDoInput(true);

            in = new BufferedReader(
                    new InputStreamReader(
                            con.getInputStream()));
            String result = in.lines().reduce("", String::concat);

            System.out.println("\nSending 'GET' request to URL : " + url);
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            System.out.println(result);
            ObjectMapper mapper = new ObjectMapper();
           return mapper.readValue(result, States.class);
        }finally {
            in.close();
        }
    }


    public List<Program> getPrograms(Token token) throws Exception{
        BufferedReader in = null;
        try {
            URL url = new URL("https://api.toonapi.com/toon/api/v1/temperature/programs");
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Bearer " + token.getAccess_token());
            con.setDoInput(true);

            in = new BufferedReader(
                    new InputStreamReader(
                            con.getInputStream()));
            String result = in.lines().reduce("", String::concat);

            System.out.println("\nSending 'GET' request to URL : " + url);
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);

            ObjectMapper mapper = new ObjectMapper();
            return Arrays.asList(mapper.readValue(result, Program[].class));
        }finally {
            in.close();
        }
    }

    public boolean putTemperature(Token token, int value, String scale) throws Exception{
        URL url = new URL("https://api.toonapi.com/toon/api/v1/temperature");

        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        try {
            con.setRequestMethod("PUT");
        }catch(ProtocolException pe){
            System.err.println("Protocol exception" + pe);
        }catch(SecurityException se){
            System.err.println("SecurityException exception" + se);
        }

        con.setDoInput(true);
        con.setDoOutput(true);

        con.setRequestProperty("Authorization",  "Bearer " + token.getAccess_token());
        con.addRequestProperty("Content-Type", "application/json");

        System.out.printf("Putting temperature to: %d %s", value, scale);

        String data = String.format("\"value\": %d, \"scale\": %s", value, scale);
        con.getOutputStream().write(data.getBytes("UTF-8"));

        System.out.printf("Response Code : %d \n", con.getResponseCode());

        return con.getResponseCode() == HttpURLConnection.HTTP_OK;
    }


    public Agreement[] getAgreements(Token token) throws Exception {
        BufferedReader in = null;
        try {
            URL url = new URL("https://api.toonapi.com/toon/api/v1/agreements");
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            String bearer = "Bearer " + token.getAccess_token();
            con.setRequestProperty("Authorization", bearer);
            con.setDoInput(true);

            in = new BufferedReader(
                    new InputStreamReader(
                            con.getInputStream()));
            String result = in.lines().reduce("", String::concat);

            System.out.println("\nSending 'GET' request to URL : " + url);
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(result, Agreement[].class);
        }finally {
            in.close();
        }
    }


    //POST Agreements
    public boolean deviceIsSet(Agreement agreement, Token token) throws Exception {
        URL url = new URL("https://api.toonapi.com/toon/api/v1/agreements");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        try {
            con.setRequestMethod("POST");
        }catch(ProtocolException pe){
            System.err.println("Protocol exception" + pe);
        }catch(SecurityException se){
            System.err.println("SecurityException exception" + se);
        }

        con.setDoInput(true);
        con.setDoOutput(true);

        con.setRequestProperty("Authorization",  "Bearer " + token.getAccess_token());
        con.addRequestProperty("Content-Type", "application/json");

        System.out.println("Posting agreements");
        String data = new ObjectMapper().writeValueAsString(agreement);

        System.out.printf("Writing agreemnt: \n %s", data.toString());
        String agreementId = String.format("{\"agreementId\":\"%s\"}", agreement.getAgreementId());
        con.getOutputStream().write(agreementId.getBytes("UTF-8"));

        System.out.printf("Response Code : %d \n", con.getResponseCode());

        return con.getResponseCode() == HttpURLConnection.HTTP_OK;
    }



    public Token getToken(String username, String password, String key, String secret) throws Exception {
        String data = String.format("grant_type=password&username=%s&password=%s", username, password);

        URL url = new URL("https://api.toonapi.com/token");
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoInput(true);
        con.setDoOutput(true);

        String basicAuth = "Basic " + Base64Utils.encodeToString((key +":"+ secret).getBytes());
        con.addRequestProperty("Authorization", basicAuth);
        con.addRequestProperty("Accept", "application/json");
        con.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

        con.getOutputStream().write(data.getBytes("UTF-8"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String result = reader.lines().reduce("", String::concat);

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(result, Token.class);
    }
}
