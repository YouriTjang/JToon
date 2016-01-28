package nl.hr.cmi.inf.Entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Agreement {
    int agreementId;
    long agreementIdChecksum;
    String city;
    String displayCommonName;
    String displayHardwareVersion;
    String displaySoftwareVersion;
    String houseNumber;
    String postalCode;
    String street;


    public Agreement() {
    }

    public int getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(int agreementId) {
        this.agreementId = agreementId;
    }

    public long getAgreementIdChecksum() {
        return agreementIdChecksum;
    }

    public void setAgreementIdChecksum(long agreementIdChecksum) {
        this.agreementIdChecksum = agreementIdChecksum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Agreement{" +
                "agreementId=" + agreementId +
                ", agreementIdChecksum=" + agreementIdChecksum +
                ", city='" + city + '\'' +
                ", displayCommonName='" + displayCommonName + '\'' +
                ", displayHardwareVersion='" + displayHardwareVersion + '\'' +
                ", displaySoftwareVersion='" + displaySoftwareVersion + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
