/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Medicine {
    private int medicineId;
    private String name;
    private int quantity;
    private double price;

    public Medicine() {
    }

    public Medicine(int medicineId, String name, int quantity, double price) {
        this.medicineId = medicineId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void information(){
    System.out.println("The  medicineId is:"+this. medicineId);
        System.out.println("The name is:"+this.name);
        System.out.println("The quantity is:"+this.quantity);
        System.out.println("The price is :"+this.price);

    }   
}
