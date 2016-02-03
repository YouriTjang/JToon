package nl.hr.cmi.inf.dtos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Authentication {
    List<Agreement> agreements;
    int clientId;
    String clientIdChecksum;
    String passwordHash;
    boolean sample;
    boolean success;

    public Authentication() {
    }

    public List<Agreement> getAgreements() {
        return agreements;
    }

    public void setAgreements(List<Agreement> agreements) {
        this.agreements = agreements;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientIdChecksum() {
        return clientIdChecksum;
    }

    public void setClientIdChecksum(String clientIdChecksum) {
        this.clientIdChecksum = clientIdChecksum;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isSample() {
        return sample;
    }

    public void setSample(boolean sample) {
        this.sample = sample;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Autentication{" +
                "agreements=" + agreements +
                ", clientId=" + clientId +
                ", clientIdChecksum='" + clientIdChecksum + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", sample=" + sample +
                ", success=" + success +
                '}';
    }
}
