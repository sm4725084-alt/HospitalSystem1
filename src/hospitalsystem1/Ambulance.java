/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Ambulance {
    private int ambulanceId;
    private String driverName;
    private String status;

    public Ambulance() {
    }

    public Ambulance(int ambulanceId, String driverName, String status) {
        this.ambulanceId = ambulanceId;
        this.driverName = driverName;
        this.status = status;
    }

    public int getAmbulanceId() {
        return ambulanceId;
    }

    public void setAmbulanceId(int ambulanceId) {
        this.ambulanceId = ambulanceId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void view(){
        System.out.println("The ambulanceId is:"+this.ambulanceId);
        System.out.println("The driverName is: "+this.driverName);
        System.out.println("The status is: "+this.status);
    }
}

    

