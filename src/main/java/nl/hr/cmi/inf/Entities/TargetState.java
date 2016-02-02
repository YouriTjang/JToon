package nl.hr.cmi.inf.Entities;

public class TargetState {
    int id;
    int tempValue;
    int dhw;
    int tempState;

    public TargetState() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTempValue() {
        return tempValue;
    }

    public void setTempValue(int tempValue) {
        this.tempValue = tempValue;
    }

    public int getDhw() {
        return dhw;
    }

    public void setDhw(int dhw) {
        this.dhw = dhw;
    }

    public int getTempState() {
        return tempState;
    }

    public void setTempState(int tempState) {
        this.tempState = tempState;
    }


    @Override
    public String toString() {
        return "TargetState{" +
                "id=" + id +
                ", tempValue=" + tempValue +
                ", dhw=" + dhw +
                ", tempState=" + tempState +
                '}';
    }
}
