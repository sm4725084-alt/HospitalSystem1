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
     patient b =new patient(2505702,"Shahd",19,"female","01204229680","cold","A+","17/5");
     b.display();
    Doctor c =new Doctor(2505702,"Shahd",19,"female","01204229680","sergine",5500,"bones");
   c.viewinfo();
   Department a=new Department(2505702,"Shahd");
   a.info();
   Room n=new Room(56,"bones",true);
   n.show();
        System.out.println("Hello Raneem");
        System.out.println("hello shahd");
    }
    
}
