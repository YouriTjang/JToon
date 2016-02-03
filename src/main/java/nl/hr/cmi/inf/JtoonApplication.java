package nl.hr.cmi.inf;

import nl.hr.cmi.inf.dtos.Agreement;
import nl.hr.cmi.inf.dtos.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@PropertySource("classpath:application.properties")
@SpringBootApplication
public class JtoonApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(JtoonApplication.class);

    @Value("${toonapi.username}")
    String USERNAME;

    @Value("${toonapi.password}")
    String PASSWORD;

    @Value("${toonapi.key}")
    String KEY;

    @Value("${toonapi.secret}")
    String SECRET;

    @Value("${toonapi.base_url}")
    String BASE_URL;


    public static void main(String[] args) {
        SpringApplication.run(JtoonApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        Connection.disableCertificateValidation();

        Api api = new Api();
        Token token = api.getToken(USERNAME, PASSWORD, KEY, SECRET);
        List<Agreement> agreements = Arrays.asList(api.getAgreements(token));
        agreements.stream().forEach(System.out::println);
        Agreement agreement = agreements.get(0);

        System.out.println(agreement);

        //if the device is correctly set
        if( api.deviceIsSet(agreement, token) ){

            //
            api.getPrograms(token);
        }
        
    }
}