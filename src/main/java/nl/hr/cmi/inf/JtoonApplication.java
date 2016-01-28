package nl.hr.cmi.inf;

import nl.hr.cmi.inf.Entities.Agreement;
import nl.hr.cmi.inf.Entities.Authentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootApplication
public class JtoonApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(JtoonApplication.class);


    final String LOGIN = "";
    final String PASSWORD = "";
    final UUID uuid = UUID.randomUUID();

	public static void main(String[] args) {
		SpringApplication.run(JtoonApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		//State state = restTemplate.getForObject("https://toonopafstand.eneco.nl/toonMobileBackendWeb/client/auth/start", State.class);
		//log.info(state.toString());
	}


    private void login(Authentication authentication){
        Map<String, String> formData = new HashMap<>(5);
        formData.put("clientId", Integer.toString(authentication.getClientId()));
        formData.put("clientIdChecksum", authentication.getClientIdChecksum());
        formData.put("agreementId", Integer.toString(authentication.getAgreements().get(0).getAgreementId()));
        formData.put("agreementIdChecksum", Long.toString(authentication.getAgreements().get(0).getAgreementIdChecksum()));
        formData.put("random", uuid.toString());

        RestTemplate restTemplate = new RestTemplate();

        //TODO what kind of object is returned here?
        Agreement agreement = restTemplate.getForObject("https://toonopafstand.eneco.nl/toonMobileBackendWeb/client/auth/start", Agreement.class, formData);
//        return agreement;
    }

    private Authentication getAuthentication(){
        RestTemplate restTemplate = new RestTemplate();
        Authentication authentication = restTemplate.getForObject("https://toonopafstand.eneco.nl/toonMobileBackendWeb/client/login", Authentication.class, LOGIN, PASSWORD);
        return authentication;
    }
}
