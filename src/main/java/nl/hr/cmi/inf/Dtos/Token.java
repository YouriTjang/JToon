package nl.hr.cmi.inf.dtos;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Token {
    String access_token;

    public Token() {
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }


    @Override
    public String toString() {
        return "Token{" +
                "access_token='" + access_token + '\'' +
                '}';
    }
}
