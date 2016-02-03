package nl.hr.cmi.inf.dtos;

/**
 * Created by marco on 03/02/16.
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class States {
    List<State> states = new ArrayList<State>();

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "States{" +
                "states=" + states +
                '}';
    }

    public States() {
    }


}