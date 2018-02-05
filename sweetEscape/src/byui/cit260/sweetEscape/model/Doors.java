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
public class Doors implements Serializable {
    
    private String openDoor;
    private String unableToOpen;
    private int doorNumber;

    public Doors() {
    }
    
    
    
    public String getOpenDoor() {
        return openDoor;
    }

    public void setOpenDoor(String openDoor) {
        this.openDoor = openDoor;
    }

    public String getUnableToOpen() {
        return unableToOpen;
    }

    public void setUnableToOpen(String unableToOpen) {
        this.unableToOpen = unableToOpen;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }
    
    
    
}
