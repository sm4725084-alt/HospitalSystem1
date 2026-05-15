/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

import java.util.ArrayList;

/**
 *
 * @author Shahd Mohamed
 */
public class Billing {
      private int billId;
    private double amount;
    private String paymentStatus;
   private ArrayList< BillItem > items;
    public Billing() {
    }

    public Billing(int billId, double amount, String paymentStatus) {
        this.billId = billId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.items = new ArrayList<>();
        
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
    private class BillItem {
        private String serviceName;
        private double price;

        public BillItem(String serviceName, double price) {
            this.serviceName = serviceName;
            this.price = price;
        }

        public void setServiceName(String serviceName) {
            this.serviceName = serviceName;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getServiceName() {
            return serviceName;
        }

        public double getPrice() {
            return price;
        }
        
        public void addItem(String serviceName, double price) {
      BillItem newItem = new BillItem(serviceName, price);
        items.add(newItem);
    }
                
            }
}
