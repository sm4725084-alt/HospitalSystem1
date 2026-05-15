/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalsystem1;

import java.util.*;


/**
 *
 * @author Shahd Mohamed
 */
public class HospitalSystem1 {
    private static final ArrayList<Person> hospitalUsers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Department surgeryDept = new Department(7,"General Surgery");
int choice = -1;
do {
            displayMenu();
           try {
                scanner.nextLine();
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); 

           
  switch(choice) {
                    case 1: addDoctor(); break;
                    case 2: addPatient(); break;
                    case 3: displayAllRecords(); break;
                    case 4: createAppointment(); break; 
                    case 5: processBilling(); break;
                    case 0: System.out.println("Exiting System... Done."); break;
                    default: System.out.println("Invalid option! Try again.");
                    
                }
           } catch(InputMismatchException e){
                System.out.println("Error: Please enter a valid number (Input Error Handling).");
                scanner.nextLine();
                         }             
        } while (choice != 0);
    }
        private static void displayMenu() {
        System.out.println("\n========= Hospital Management System =========");
        System.out.println("1. Add New Doctor (Inheritance)");
        System.out.println("2. Add New Patient (Inheritance)");
        System.out.println("3. Display All Users (Polymorphism & Parent Ref)");
        System.out.println("4. Schedule Appointment (Association)");
        System.out.println("5. Generate Bill (Composition)");
        System.out.println("0. Exit");
        }
        private static void addDoctor(){
        System.out.print("Enter ID: "); String id = scanner.nextLine();
        System.out.print("Enter Name: "); String name = scanner.nextLine();
        System.out.print("Specialization: "); String spec = scanner.nextLine();
        hospitalUsers.add(new Doctor(77, name, 40, "Male", "0123", spec, 15000, "Surgery"));
        System.out.println("Doctor added successfully.");
    }
    private static void addPatient() {
        System.out.print("Enter ID: "); String id = scanner.nextLine();
        System.out.print("Enter Name: "); String name = scanner.nextLine();
        System.out.print("Disease: "); String disease = scanner.nextLine();
        hospitalUsers.add(new patient(44, name, 25, "Female", "0111", disease, "O+", "2026-05-15"));
        System.out.println("Patient added successfully.");
    }
    private static void displayAllRecords() {
        if (hospitalUsers.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n--- Current Hospital Records ---");
        for (Person p : hospitalUsers) {
            p.display(); 
        }
    }
    private static void createAppointment() {
        Doctor d = null;
        patient p = null;
        for (Person person : hospitalUsers) {
            if(person instanceof Doctor){
                d = (Doctor) person;
            }
            
            if (person instanceof patient){
                p = (patient) person;
            }
        }
        if (d != null && p != null) {
            Appointment app = new Appointment(66, "2026-06-01", "10:00 AM", p.getName(), d.getName());
            app.show();
        } else {
            System.out.println("Need at least one doctor and one patient to create association.");
        }
    }
    private static void processBilling() {
        Billing b = new Billing(66, 500.0, "Paid");
        b.info();
        DBConnection.connect();
      
    }


}