package nl.hr.cmi.inf.Entities;

public class Program extends Resource{
    String type;
    int startDayOfWeek;
    int startHour;
    int startMin;
    int endDayOfWeek;
    int endHour;
    int endMin;
    State targetState;

    public Program() {
        this.url = "/temperature/programs";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStartDayOfWeek() {
        return startDayOfWeek;
    }

    public void setStartDayOfWeek(int startDayOfWeek) {
        this.startDayOfWeek = startDayOfWeek;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMin() {
        return startMin;
    }

    public void setStartMin(int startMin) {
        this.startMin = startMin;
    }

    public int getEndDayOfWeek() {
        return endDayOfWeek;
    }

    public void setEndDayOfWeek(int endDayOfWeek) {
        this.endDayOfWeek = endDayOfWeek;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMin() {
        return endMin;
    }

    public void setEndMin(int endMin) {
        this.endMin = endMin;
    }

    public State getTargetState() {
        return targetState;
    }

    public void setTargetState(State targetState) {
        this.targetState = targetState;
    }

    @Override
    public String toString() {
        return "Program{" +
                "type='" + type + '\'' +
                ", startDayOfWeek=" + startDayOfWeek +
                ", startHour=" + startHour +
                ", startMin=" + startMin +
                ", endDayOfWeek=" + endDayOfWeek +
                ", endHour=" + endHour +
                ", endMin=" + endMin +
                ", targetState=" + targetState +
                '}';
    }
}
