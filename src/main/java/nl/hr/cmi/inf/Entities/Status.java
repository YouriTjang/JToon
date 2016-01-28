package nl.hr.cmi.inf.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {
    GasUsage gasUsage;
    PowerUsage powerUsage;
    ThermostatInfo thermostatInfo;
    List<State> thermostatStates;

    public Status() {
    }

    public GasUsage getGasUsage() {
        return gasUsage;
    }

    public void setGasUsage(GasUsage gasUsage) {
        this.gasUsage = gasUsage;
    }

    public PowerUsage getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(PowerUsage powerUsage) {
        this.powerUsage = powerUsage;
    }

    public ThermostatInfo getThermostatInfo() {
        return thermostatInfo;
    }

    public void setThermostatInfo(ThermostatInfo thermostatInfo) {
        this.thermostatInfo = thermostatInfo;
    }

    public List<State> getThermostatStates() {
        return thermostatStates;
    }

    public void setThermostatStates(List<State> thermostatStates) {
        this.thermostatStates = thermostatStates;
    }

    @Override
    public String toString() {
        return "Status{" +
                "gasUsage=" + gasUsage +
                ", powerUsage=" + powerUsage +
                ", thermostatInfo=" + thermostatInfo +
                ", thermostatStates=" + thermostatStates +
                '}';
    }
}
