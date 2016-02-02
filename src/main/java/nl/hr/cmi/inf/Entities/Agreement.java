package nl.hr.cmi.inf.Entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Agreement {
    int agreementId;
    String agreementIdChecksum;
    String street;
    String houseNumber;
    String postalCode;
    String city;
    String heatingType;
    String displayCommonName;
    String displayHardwareVersion;
    String displaySoftwareVersion;
    boolean isToonSolar;
    boolean isToonly;


    public Agreement() {
    }

    public int getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(int agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementIdChecksum() {
        return agreementIdChecksum;
    }

    public void setAgreementIdChecksum(String agreementIdChecksum) {
        this.agreementIdChecksum = agreementIdChecksum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(String heatingType) {
        this.heatingType = heatingType;
    }

    public String getDisplayCommonName() {
        return displayCommonName;
    }

    public void setDisplayCommonName(String displayCommonName) {
        this.displayCommonName = displayCommonName;
    }

    public String getDisplayHardwareVersion() {
        return displayHardwareVersion;
    }

    public void setDisplayHardwareVersion(String displayHardwareVersion) {
        this.displayHardwareVersion = displayHardwareVersion;
    }

    public String getDisplaySoftwareVersion() {
        return displaySoftwareVersion;
    }

    public void setDisplaySoftwareVersion(String displaySoftwareVersion) {
        this.displaySoftwareVersion = displaySoftwareVersion;
    }

    public boolean isToonSolar() {
        return isToonSolar;
    }

    public void setToonSolar(boolean toonSolar) {
        isToonSolar = toonSolar;
    }

    public boolean isToonly() {
        return isToonly;
    }

    public void setToonly(boolean toonly) {
        isToonly = toonly;
    }

    @Override
    public String toString() {
        return "Agreement{" +
                "agreementId=" + agreementId +
                ", agreementIdChecksum='" + agreementIdChecksum + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", heatingType='" + heatingType + '\'' +
                ", displayCommonName='" + displayCommonName + '\'' +
                ", displayHardwareVersion='" + displayHardwareVersion + '\'' +
                ", displaySoftwareVersion='" + displaySoftwareVersion + '\'' +
                ", isToonSolar=" + isToonSolar +
                ", isToonly=" + isToonly +
                '}';
    }
}
