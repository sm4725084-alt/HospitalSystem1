/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Prescription {
    private  int prescriptionId;
    private String medicineName;
    private String dosage;
    private String duration;

    public Prescription() {
    }

    public Prescription(int prescriptionId, String medicineName,
                        String dosage, String duration) {
        this.prescriptionId = prescriptionId;
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.duration = duration;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
public void display(){
    System.out.println("The prescriptionId is:"+this.prescriptionId);
    System.out.println("The  medicineName is:"+this. medicineName);
    System.out.println("The dosage is:"+this.dosage);
    System.out.println("The duration is:"+this.duration);
}
    
}
