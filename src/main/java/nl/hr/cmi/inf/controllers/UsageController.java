package nl.hr.cmi.inf.controllers;

import nl.hr.cmi.inf.entities.Usage;
import org.springframework.stereotype.Controller;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UsageController {

    public Usage getUsage(){
        return new Usage(1000, 800, Duration.ofDays(1));
    }
}
