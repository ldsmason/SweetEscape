/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.model;
import java.awt.Point;

/**
 *
 * @author chadh
 */
public enum Inventory {
    
    2-Liter Bottle("2-Liter Bottle", "An old soda bottle.", new Point(1,0));
    Drift Pin ("Drift Pin", "Drift Pin", new point (2,0));
    
    
    
    private String inspectItem;
    private int itemName;
    private double itemDescription;

    public Inventory(int inspectItem, int itemName, double itemDescription) {
        this.inspectItem = inspectItem;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }
    

    public int getInspectItem() {
        return inspectItem;
    }

    public void setInspectItem(int inspectItem) {
        this.inspectItem = inspectItem;
    }

    public int getItemName() {
        return itemName;
    }

    public void setItemName(int itemName) {
        this.itemName = itemName;
    }

    public double getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(double itemDescription) {
        this.itemDescription = itemDescription;
    }
    
    
    

}
