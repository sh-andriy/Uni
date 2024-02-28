package lab1.models;

public class Doctor {
    private String surname;
    private int experienceYears;
    private Appointment[] appointments;

    public Doctor(String surname, int experienceYears, Appointment[] appointments) {
        this.surname = surname;
        this.experienceYears = experienceYears;
        this.appointments = appointments;
    }

    // method to calculate the average num of visitors
    public double averageNumberOfVisitors() {
        int sum = 0;
        for (Appointment appointment : appointments) {
            sum += appointment.getNumberOfVisitors();
        }
        return appointments.length > 0 ? (double) sum / appointments.length : 0;
    }

    // meethod to find the appointment with the min nums of visitors
    public Appointment appointmentWithMinimumVisitors() {
        if (appointments.length == 0) return null;
        Appointment minAppointment = appointments[0];
        for (Appointment appointment : appointments) {
            if (appointment.getNumberOfVisitors() < minAppointment.getNumberOfVisitors()) {
                minAppointment = appointment;
            }
        }
        return minAppointment;
    }

    // method to find the appointment with the longest comment
    public Appointment appointmentWithLongestComment() {
        if (appointments.length == 0) return null;
        Appointment longestCommentAppointment = appointments[0];
        for (Appointment appointment : appointments) {
            if (appointment.getComment().length() > longestCommentAppointment.getComment().length()) {
                longestCommentAppointment = appointment;
            }
        }
        return longestCommentAppointment;
    }
}
