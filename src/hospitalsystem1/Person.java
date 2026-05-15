/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public  abstract class Person {
    protected int id;
    protected String name;
    protected int age;
    protected String gender;
    protected String phone;

    public Person() {
    }

    public Person(int id, String name, int age, String gender, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    public abstract int getId();

    public  abstract String getName() ;

    public  abstract int getAge();

    public abstract String getGender();

    public abstract String getPhone();

    public abstract void setId(int id);

    public  abstract void setName(String name);

    public  abstract void setAge(int age); 

    public  abstract void setGender(String gender);

    public  abstract void setPhone(String phone);
    public abstract void display();
      
        
                
    

    
}
