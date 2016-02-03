package nl.hr.cmi.inf.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class EnergySupplier {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    String name;

    public EnergySupplier() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
