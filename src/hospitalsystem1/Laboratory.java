/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Laboratory {
    private int labId;
    private String labName;
    private String testType;

    public Laboratory() {
    }

    public Laboratory(int labId, String labName, String testType) {
        this.labId = labId;
        this.labName = labName;
        this.testType = testType;
    }

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
    public void show(){
        System.out.println("The labId is:"+this.labId );
        System.out.println("The labName is:"+this.labName);
        System.out.println("The testType is: "+this.testType);
    }
}
    

