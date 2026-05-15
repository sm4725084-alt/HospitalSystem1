/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Insurance {
    
    private int insuranceId;
    private String companyName;
    private double coverageAmount;

    public Insurance() {
    }

    public Insurance(int insuranceId, String companyName,
                     double coverageAmount) {
        this.insuranceId = insuranceId;
        this.companyName = companyName;
        this.coverageAmount = coverageAmount;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }
public void show(){
    System.out.println("The insuranceId is:"+this.insuranceId);
    System.out.println("The companyName is:"+this.companyName);
    System.out.println("The coverageAmount is:"+this.coverageAmount);
}
}
