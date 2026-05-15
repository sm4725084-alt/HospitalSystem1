/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Nurse extends Person {
     private String shift;
    private String assignedWard;

    public Nurse() {
    }

    public Nurse(int id, String name, int age, String gender, String phone,
                 String shift, String assignedWard) {
        super(id, name, age, gender, phone);
        this.shift = shift;
        this.assignedWard = assignedWard;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getAssignedWard() {
        return assignedWard;
    }

    public void setAssignedWard(String assignedWard) {
        this.assignedWard = assignedWard;
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
        System.out.println("The Shift is:"+this.shift);
        System.out.println("The AssignedWord is:"+this.assignedWard);
        
    }
}
    

