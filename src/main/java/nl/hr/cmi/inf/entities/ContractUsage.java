package nl.hr.cmi.inf.entities;

public class ContractUsage implements Comparable{
    Contract contract;
    Usage usage;

    public ContractUsage(Contract contract, Usage usage) {
        this.contract = contract;
        this.usage = usage;
    }

    @Override
    public int compareTo(Object o){
        ContractUsage that = (ContractUsage) o;
        return (int) (this.getCost() - that.getCost());
    }

    public float getCost(){
        return this.contract.getStroomKosten() * this.usage.electriciteit +
                this.contract.getStroomVasteLeveringskosten()  +
                this.contract.getGasKosten() * this.usage.gas +
                this.contract.getGasVasteLeveringskosten() -
                this.contract.eenmaligeKorting;
    }


    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "ContractUsage{" +
                "contract=" + contract +
                "} = " +
                getCost();
    }
}
