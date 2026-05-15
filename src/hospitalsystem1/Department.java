/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;
import java.util.ArrayList;
/**
 *
 * @author Shahd Mohamed
 */
public class Department {
      private int departmentId;
    private String departmentName;
// Aggregation
    private ArrayList<Doctor> doctors;
    public Department() {
    }

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        doctors = new ArrayList<>();
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void info(){
        System.out.println("The departmentId is :"+this.departmentId);
        System.out.println("The departmentName is:"+this.departmentName);
    }
     public void addDoctor(Doctor doctor) {

        doctors.add(doctor);
    }

    public void showDoctors() {

        for (Doctor d : doctors) {

            d.display();
        }
    }

    public void closeDepartment() {

        System.out.println(
                departmentName + " Department Closed."
        );

        doctors.clear();
    }
}
    

