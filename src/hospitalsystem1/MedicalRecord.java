/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class MedicalRecord {
     private int recordId;
    private String diagnosis;
    private String prescriptions;
    private String testResults;

    public MedicalRecord() {
    }

    public MedicalRecord(int recordId, String diagnosis,
                         String prescriptions, String testResults) {
        this.recordId = recordId;
        this.diagnosis = diagnosis;
        this.prescriptions = prescriptions;
        this.testResults = testResults;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }

    public String getTestResults() {
        return testResults;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }
public void display(){
    System.out.println("The recordId is:"+this.recordId);
    System.out.println("The diagnosis is:"+this.diagnosis);
    System.out.println("The prescriptions is:"+this.prescriptions);
    System.out.println("The testResults is: "+this.testResults);
}
    
}
