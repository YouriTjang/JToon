package nl.hr.cmi.inf.Entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PowerUsage {
    float avgValue;
    float dayCost;
    float dayCostProduced;
    long dayLowUsage;
    long dayUsage;
    boolean isSmart;
    long meterReading;
    long meterReadingLow;
    long value;
    long valueProduced;

    public PowerUsage() {
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

    public float getDayCostProduced() {
        return dayCostProduced;
    }

    public void setDayCostProduced(float dayCostProduced) {
        this.dayCostProduced = dayCostProduced;
    }

    public long getDayLowUsage() {
        return dayLowUsage;
    }

    public void setDayLowUsage(long dayLowUsage) {
        this.dayLowUsage = dayLowUsage;
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

    public long getMeterReadingLow() {
        return meterReadingLow;
    }

    public void setMeterReadingLow(long meterReadingLow) {
        this.meterReadingLow = meterReadingLow;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getValueProduced() {
        return valueProduced;
    }

    public void setValueProduced(long valueProduced) {
        this.valueProduced = valueProduced;
    }
}
