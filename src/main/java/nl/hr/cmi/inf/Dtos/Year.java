
package nl.hr.cmi.inf.dtos;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "timstamp",
    "value",
    "pk",
    "op"
})
public class Year {
    @JsonProperty("timstamp")
    private Long timstamp;
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("op")
    private Integer op;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The timstamp
     */
    @JsonProperty("timstamp")
    public Long getTimstamp() {
        return timstamp;
    }

    /**
     * 
     * @param timstamp
     *     The timstamp
     */
    @JsonProperty("timstamp")
    public void setTimstamp(Long timstamp) {
        this.timstamp = timstamp;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The pk
     */
    @JsonProperty("pk")
    public Integer getPk() {
        return pk;
    }

    /**
     * 
     * @param pk
     *     The pk
     */
    @JsonProperty("pk")
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * 
     * @return
     *     The op
     */
    @JsonProperty("op")
    public Integer getOp() {
        return op;
    }

    /**
     * 
     * @param op
     *     The op
     */
    @JsonProperty("op")
    public void setOp(Integer op) {
        this.op = op;
    }

    //@Override
    //public String toString() {
    //    return ToStringBuilder.reflectionToString(this);
   // }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
