package nl.hr.cmi.inf.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Duration;

@Entity
public class Usage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;

    int electriciteit;
    int gas;

    Duration duration;

    public Usage(int electriciteit, int gas, Duration duration) {
        this.electriciteit = electriciteit;
        this.gas = gas;
        this.duration = duration;
    }
}
