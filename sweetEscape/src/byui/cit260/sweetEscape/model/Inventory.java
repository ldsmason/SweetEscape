/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.model;
import java.io.Serializable;
import java.awt.Point;
        

/**
 *
 * @author chadh
 */
public enum Inventory implements Serializable {
    
    Hammer ("Hammer", "Hammer", new Point(1,0)),
    DriftPin ("Drift Pin", "Drift Pin", new Point(2,0)),
    LockPick ("Lock Pick", "Lock Pick", new Point(3,0)),
    TwoLiterBottle ("Two-Liter Bottle","Two-Liter Bottle", new Point(4,0)),
    Sand ("Sand","Sand", new Point(5,0));
    
    private String itemName;
    private String itemDescription;
    private Point coordinates;
    
    Inventory (String itemName, String itemDescription, Point coordinates){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.coordinates = coordinates;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Inventory{" + "itemName=" + itemName + ", itemDescription=" + itemDescription + ", coordinates=" + coordinates + '}';
    }
    
    

    }