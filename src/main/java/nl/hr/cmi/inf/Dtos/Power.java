
package nl.hr.cmi.inf.dtos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "hours",
    "days",
    "weeks",
    "months",
    "years"
})
public class Power {

    @JsonProperty("hours")
    private List<Hour> hours = new ArrayList<Hour>();
    @JsonProperty("days")
    private List<Day> days = new ArrayList<Day>();
    @JsonProperty("weeks")
    private List<Week> weeks = new ArrayList<Week>();
    @JsonProperty("months")
    private List<Month> months = new ArrayList<Month>();
    @JsonProperty("years")
    private List<Year> years = new ArrayList<Year>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The hours
     */
    @JsonProperty("hours")
    public List<Hour> getHours() {
        return hours;
    }

    /**
     * 
     * @param hours
     *     The hours
     */
    @JsonProperty("hours")
    public void setHours(List<Hour> hours) {
        this.hours = hours;
    }

    /**
     * 
     * @return
     *     The days
     */
    @JsonProperty("days")
    public List<Day> getDays() {
        return days;
    }

    /**
     * 
     * @param days
     *     The days
     */
    @JsonProperty("days")
    public void setDays(List<Day> days) {
        this.days = days;
    }

    /**
     * 
     * @return
     *     The weeks
     */
    @JsonProperty("weeks")
    public List<Week> getWeeks() {
        return weeks;
    }

    /**
     * 
     * @param weeks
     *     The weeks
     */
    @JsonProperty("weeks")
    public void setWeeks(List<Week> weeks) {
        this.weeks = weeks;
    }

    /**
     * 
     * @return
     *     The months
     */
    @JsonProperty("months")
    public List<Month> getMonths() {
        return months;
    }

    /**
     * 
     * @param months
     *     The months
     */
    @JsonProperty("months")
    public void setMonths(List<Month> months) {
        this.months = months;
    }

    /**
     * 
     * @return
     *     The years
     */
    @JsonProperty("years")
    public List<Year> getYears() {
        return years;
    }

    /**
     * 
     * @param years
     *     The years
     */
    @JsonProperty("years")
    public void setYears(List<Year> years) {
        this.years = years;
    }

//    @Override
//    public String toString() {
//        return ToStringBuilder.reflectionToString(this);
//    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
