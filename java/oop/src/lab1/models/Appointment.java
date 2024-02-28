package lab1.models;

public class Appointment {
    private Day day;
    private int numberOfVisitors;
    private String comment;

    public Appointment(Day day, int numberOfVisitors, String comment) {
        this.day = day;
        this.numberOfVisitors = numberOfVisitors;
        this.comment = comment;
    }

    public Day getDay() {
        return day;
    }

    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    public String getComment() {
        return comment;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public void setNumberOfVisitors(int numberOfVisitors) {
        this.numberOfVisitors = numberOfVisitors;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
