/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;

/**
 *
 * @author Shahd Mohamed
 */
public class Room {
      private int roomNumber;
    private String type;
    private boolean available;

    public Room() {
    }

    public Room(int roomNumber, String type, boolean available) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.available = available;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
   public void show(){
       System.out.println("The roomnumber is: "+this.roomNumber);
       System.out.println("The Type is:"+this.type);
       System.out.println("The available is:"+this.available);
   }
}
    

