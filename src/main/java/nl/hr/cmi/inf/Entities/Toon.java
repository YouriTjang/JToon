package nl.hr.cmi.inf.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Toon {
    String username;
    String password;
    String toonstate;
    String sessiondata;
    String debug;
    String max_retries;
    String retry_interval;
//    enum Datakeys{DEVICESTATUSINFO, GASUSAGE, POWERUSAGE, THERMOSTATINFO}



}
