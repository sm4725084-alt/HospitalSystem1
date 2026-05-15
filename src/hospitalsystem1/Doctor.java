/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Doctor extends Person {
     private String specialization;
    private double salary;
    private String department;

    public Doctor() {
    }

    public Doctor(int id, String name, int age, String gender, String phone,
                  String specialization, double salary, String department) {
        super(id, name, age, gender, phone);
        this.specialization = specialization;
        this.salary = salary;
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    

    @Override
    public int getId() {
   return id;
    }

    @Override
    public String getName() {
       return name;
    }

    @Override
    public int getAge() {
       return age;
    }

    @Override
    public String getGender() {
      return phone;
    }

    @Override
    public String getPhone() {
       return phone;
    }

    @Override
    public void setId(int id) {
      this.id=id;
    }

    @Override
    public void setName(String name) {
     this.name=name;
    }

    @Override
    public void setAge(int age) {
        this.age=age;
    }

    @Override
    public void setGender(String gender) {
      this.gender=gender;
    }

    @Override
    public void setPhone(String phone) {
        this.phone=phone;
    }

    @Override
    public void display() {
          System.out.println("The ID is:"+this.id);
        System.out.println("The Name is:"+this.name);
        System.out.println("The Age is:"+this.age);
        System.out.println("The Gender is:"+this.gender);
        System.out.println("The Phone is:"+this.phone);
        System.out.println("The specialization is:"+this.specialization);
        System.out.println("The salary is:"+this.salary);
        System.out.println("The department is:"+this.department);
        
    }
    public void writePrescription(String patientName, String medicine) {
        System.out.println("Dr. " + getName() + " prescribed " + medicine + " for " + patientName);
    }
 }
    

