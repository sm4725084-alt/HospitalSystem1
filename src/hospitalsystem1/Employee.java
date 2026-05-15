/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Employee extends Person {
     private String jobTitle;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, String gender, String phone,
                    String jobTitle, double salary) {
        super(id, name, age, gender, phone);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
public void display(){
      System.out.println("The ID is:"+this.id);
        System.out.println("The Name is:"+this.name);
        System.out.println("The Age is:"+this.age);
        System.out.println("The Gender is:"+this.gender);
        System.out.println("The Phone is:"+this.phone);
        System.out.println("The jobTitle is:"+this.jobTitle);
        System.out.println("The Salary is:"+this.salary);
    
}
public void display(double salary,String jobTitle){
    System.out.println("The jobTitle is:"+this.jobTitle);
        System.out.println("The Salary is:"+this.salary);
}
    
}
