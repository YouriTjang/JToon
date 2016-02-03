package nl.hr.cmi.inf.controllers;

import nl.hr.cmi.inf.entities.Contract;
import nl.hr.cmi.inf.entities.ContractUsage;
import nl.hr.cmi.inf.entities.Usage;

import java.util.List;

public class CompareController {

//    @Autowired
//    CompareController compareController;
//
//    @Autowired
//    UsageController usageController;

    public static void main(String[] args) {
        System.out.println(getMinContract());
    }


    private static ContractUsage getMinContract() {
        UsageController usageController = new UsageController();
        Usage usage = usageController.getUsage();

        ContractController contractController = new ContractController();
        List<Contract> contracts = contractController.getContracts();

        ContractUsage contractUsage = contracts.stream()
                .map(contract ->new ContractUsage(contract, usage))
                .min((o1, o2) -> o1.compareTo(o2) )
                .get();
        return contractUsage;
    }
}
