/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.model;
import java.io.Serializable;

/**
 *
 * @author nathanielmason
 */
public class Door implements Serializable {
    
    private double openDoor;
    private double unableToOpen;
    private int doorNumber;
    double price = 40;
    String description;
    String promptmessage;
   

    public Door() {
    }

    public double getOpenDoor() {
        return openDoor;
    }

    public void setOpenDoor(double openDoor) {
        this.openDoor = openDoor;
    }

    public double getUnableToOpen() {
        return unableToOpen;
    }

    public void setUnableToOpen(double unableToOpen) {
        this.unableToOpen = unableToOpen;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPromptmessage() {
        return promptmessage;
    }

    public void setPromptmessage(String promptmessage) {
        this.promptmessage = promptmessage;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.openDoor) ^ (Double.doubleToLongBits(this.openDoor) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.unableToOpen) ^ (Double.doubleToLongBits(this.unableToOpen) >>> 32));
        hash = 79 * hash + this.doorNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Door other = (Door) obj;
        if (Double.doubleToLongBits(this.openDoor) != Double.doubleToLongBits(other.openDoor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.unableToOpen) != Double.doubleToLongBits(other.unableToOpen)) {
            return false;
        }
        if (this.doorNumber != other.doorNumber) {
            return false;
        }
        return true;
       
    }

    @Override
    public String toString() {
        return "Doors{" + "openDoor=" + openDoor + ", unableToOpen=" + unableToOpen + ", doorNumber=" + doorNumber + '}';
    }
    
}
