/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class patient extends Person{
    private String disease;
    private String bloodType;
    private String admissionDate;

    public patient() {
    }

    public patient(int id, String name, int age, String gender, String phone,
                   String disease, String bloodType, String admissionDate) {
        super(id, name, age, gender, phone);
        this.disease = disease;
        this.bloodType = bloodType;
        this.admissionDate = admissionDate;
    }
    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
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
        System.out.println("The disease is:"+this.disease);
        System.out.println("The bloodType is:"+this.bloodType);
        System.out.println("The  admissionDate is:"+this.admissionDate);
    }
}
    

