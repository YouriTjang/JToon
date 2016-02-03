package nl.hr.cmi.inf.controllers;

import nl.hr.cmi.inf.entities.Contract;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContractController {


    public List<Contract> getContracts(){
        List<Contract> contracts = new ArrayList<>();
        contracts.add(new Contract("budgetenergie",	0.2261f	,   3.0f ,0.6314f,	3f,	135f));
        contracts.add(new Contract("nuon",  0.1827f,	3.25f, 0.6369f,	3.25f, 166.86f));
        contracts.add(new Contract("Essent", 0.2078f,  3.25f, 0.6177f,	3.255f, 50f));
        contracts.add(new Contract("budgetenergie", 0.2205f	,   2.99f	, 0.6009f, 2.99f, 80f));
        contracts.add(new Contract("Eneco", 0.178f	,   3.25f	,0.6419f,	3.25f, 166.86f));
        return contracts;
    }


    public Contract getCurrentContract(){
        return new Contract("budgetenergie", 0.2561f, 3.0f ,0.6314f,	3f,	135f);
    }


}


