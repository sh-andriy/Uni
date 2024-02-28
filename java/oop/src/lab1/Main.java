package lab1;

import lab1.models.Appointment;
import lab1.models.Day;
import lab1.models.Doctor;

public class Main {
    public static void main(String[] args) {
        Appointment appointment1 = new Appointment(Day.MONDAY, 10, "Routine check-up");
        Appointment appointment2 = new Appointment(Day.WEDNESDAY, 5, "Consultation and advice");
        Appointment appointment3 = new Appointment(Day.FRIDAY, 2, "Follow-up after surgery, detailed discussion on recovery process");

        // appointments :)
        Appointment[] appointments = {appointment1, appointment2, appointment3};

        Doctor doctor = new Doctor("Smith", 15, appointments);

        // перевірочка невелика тепер:
        System.out.println("Average number of visitors: " + doctor.averageNumberOfVisitors());
        Appointment minVisitorsAppointment = doctor.appointmentWithMinimumVisitors();
        System.out.println("Appointment with minimum number of visitors: " + minVisitorsAppointment.getDay() + " with " + minVisitorsAppointment.getNumberOfVisitors() + " visitors.");
        Appointment longestCommentAppointment = doctor.appointmentWithLongestComment();
        System.out.println("Appointment with the longest comment: " + longestCommentAppointment.getDay() + " - " + longestCommentAppointment.getComment());
    }
}
