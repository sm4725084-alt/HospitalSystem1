/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Billing {
      private int billId;
    private double amount;
    private String paymentStatus;

    public Billing() {
    }

    public Billing(int billId, double amount, String paymentStatus) {
        this.billId = billId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
public void info(){
    System.out.println("The billId is:"+this.billId);
    System.out.println("The amount is:"+this.amount);
    System.out.println("The paymentStatus is:"+this.paymentStatus);
}
    
}
