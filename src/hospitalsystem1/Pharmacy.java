/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Pharmacy {
    private int pharmacyId;
    private String pharmacyName;

    public Pharmacy() {
    }

    public Pharmacy(int pharmacyId, String pharmacyName) {
        this.pharmacyId = pharmacyId;
        this.pharmacyName = pharmacyName;
    }

    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }
    public void show(){
        System.out.println("The PharmacyId is:"+this.pharmacyId);
        System.out.println("The PharmacyName is:"+this.pharmacyName);
        
    }
}
    

