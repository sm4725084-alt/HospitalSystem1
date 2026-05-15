/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class HospitalSystem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
         Doctor d2 = 
                 new Doctor(2, "Sara", 45, "Female", "0123552567", "Neurology", 9000.0, "Emergency");

        Department dep = new Department(101, "Emergency");

        
        dep.addDoctor(d2);
         dep.showDoctors();
          dep.closeDepartment();//aggregation
          
          
          
          
    }
}
    
    

