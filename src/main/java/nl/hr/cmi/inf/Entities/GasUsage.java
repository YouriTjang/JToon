package nl.hr.cmi.inf.Entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GasUsage {
    float avgDayValue;
    float avgValue;
    float dayCost;
    long dayUsage;
    boolean isSmart;
    long meterReading;
    float value;


    public GasUsage() {
    }

    public float getAvgDayValue() {
        return avgDayValue;
    }

    public void setAvgDayValue(float avgDayValue) {
        this.avgDayValue = avgDayValue;
    }

    public float getAvgValue() {
        return avgValue;
    }

    public void setAvgValue(float avgValue) {
        this.avgValue = avgValue;
    }

    public float getDayCost() {
        return dayCost;
    }

    public void setDayCost(float dayCost) {
        this.dayCost = dayCost;
    }

    public long getDayUsage() {
        return dayUsage;
    }

    public void setDayUsage(long dayUsage) {
        this.dayUsage = dayUsage;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public long getMeterReading() {
        return meterReading;
    }

    public void setMeterReading(long meterReading) {
        this.meterReading = meterReading;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}

