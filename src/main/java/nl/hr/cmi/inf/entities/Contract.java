package nl.hr.cmi.inf.entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class Contract {
    String energySupplier;

    float stroomKosten;
    float stroomVasteLeveringskosten;

    float gasKosten;
    float gasVasteLeveringskosten;

    float eenmaligeKorting;

    LocalDateTime startDate;
    Duration duration;

    public Contract() {
    }

    public Contract(String energySupplier, float stroomKosten, float stroomVasteLeveringskosten, float gasKosten, float gasVasteLeveringskosten, float eenmaligeKorting) {
        this.energySupplier = energySupplier;
        this.stroomKosten = stroomKosten;
        this.stroomVasteLeveringskosten = stroomVasteLeveringskosten;
        this.gasKosten = gasKosten;
        this.gasVasteLeveringskosten = gasVasteLeveringskosten;
        this.eenmaligeKorting = eenmaligeKorting;
    }

    public Contract(String energySupplier, float stroomKosten, float stroomVasteLeveringskosten, float gasKosten, float gasVasteLeveringskosten, float eenmaligeKorting, LocalDateTime startDate, Duration duration) {
        this.energySupplier = energySupplier;
        this.stroomKosten = stroomKosten;
        this.stroomVasteLeveringskosten = stroomVasteLeveringskosten;
        this.gasKosten = gasKosten;
        this.gasVasteLeveringskosten = gasVasteLeveringskosten;
        this.eenmaligeKorting = eenmaligeKorting;
        this.startDate = startDate;
        this.duration = duration;
    }

    public String getEnergySupplier() {
        return energySupplier;
    }

    public void setEnergySupplier(String energySupplier) {
        this.energySupplier = energySupplier;
    }

    public float getStroomKosten() {
        return stroomKosten;
    }

    public void setStroomKosten(float stroomKosten) {
        this.stroomKosten = stroomKosten;
    }

    public float getStroomVasteLeveringskosten() {
        return stroomVasteLeveringskosten;
    }

    public void setStroomVasteLeveringskosten(float stroomVasteLeveringskosten) {
        this.stroomVasteLeveringskosten = stroomVasteLeveringskosten;
    }

    public float getGasKosten() {
        return gasKosten;
    }

    public void setGasKosten(float gasKosten) {
        this.gasKosten = gasKosten;
    }

    public float getGasVasteLeveringskosten() {
        return gasVasteLeveringskosten;
    }

    public void setGasVasteLeveringskosten(float gasVasteLeveringskosten) {
        this.gasVasteLeveringskosten = gasVasteLeveringskosten;
    }

    public float getEenmaligeKorting() {
        return eenmaligeKorting;
    }

    public void setEenmaligeKorting(float eenmaligeKorting) {
        this.eenmaligeKorting = eenmaligeKorting;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Contract{" +
                "energySupplier='" + energySupplier + '\'' +
                ", stroomKosten=" + stroomKosten +
                ", stroomVasteLeveringskosten=" + stroomVasteLeveringskosten +
                ", gasKosten=" + gasKosten +
                ", gasVasteLeveringskosten=" + gasVasteLeveringskosten +
                ", eenmaligeKorting=" + eenmaligeKorting +
                ", startDate=" + startDate +
                ", duration=" + duration +
                '}';
    }
}
