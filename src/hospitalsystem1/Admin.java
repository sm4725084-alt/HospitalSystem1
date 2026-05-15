/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Admin extends Person {
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(int id, String name, int age, String gender, String phone,
                 String username, String password) {
        super(id, name, age, gender, phone);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
@Override
public void display(){
     System.out.println("The ID is:"+this.id);
        System.out.println("The Name is:"+this.name);
        System.out.println("The Age is:"+this.age);
        System.out.println("The Gender is:"+this.gender);
        System.out.println("The Phone is:"+this.phone);
        System.out.println("The username is:"+this.username);
        System.out.println("The password is:"+this.password);
}
    
}
