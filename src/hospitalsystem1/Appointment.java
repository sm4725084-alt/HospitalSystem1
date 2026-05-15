/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Appointment {
     private int appointmentId;
    private String date;
    private String time;
    private String patientName;
    private String doctorName;

    public Appointment() {
    }

    public Appointment(int appointmentId, String date, String time,
                       String patientName, String doctorName) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.time = time;
        this.patientName = patientName;
        this.doctorName = doctorName;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
public void show(){
    System.out.println("The appointmentId is:"+this.appointmentId);
    System.out.println("The date is:"+this.date);
    System.out.println("The time is:"+this.time);
    System.out.println("The patientName is:"+this.patientName);
    System.out.println("The doctorName is:"+this.doctorName);
    
}
    
}
