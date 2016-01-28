package nl.hr.cmi.inf.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class State {
    int dhw;
    int id;
    int tempValue;

    public State() {
    }

    public int getDhw() {
        return dhw;
    }

    public void setDhw(int dhw) {
        this.dhw = dhw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTempValue() {
        return tempValue;
    }

    public void setTempValue(int tempValue) {
        this.tempValue = tempValue;
    }

    @Override
    public String toString() {
        return "State{" +
                "dhw=" + dhw +
                ", id=" + id +
                ", tempValue=" + tempValue +
                '}';
    }
}
