/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;
import byui.cit260.sweetEscape.model.Inventory;
import byui.cit260.sweetEscape.exceptions.InventoryControlException;
import byui.cit260.sweetEscape.model.Item;
import java.io.Serializable;

/**
 *
 * @author nathanielmason
 */
public class InventoryControl implements Serializable {

    public static void pickLock(double mass, double force, double guessAccel) 
            throws InventoryControlException {

        double accel = force / mass;
        
        if (guessAccel != accel) {
            throw new InventoryControlException("Your guess for acceleration is incorrect!");

        } 

    }

    public static double checkMass(double guessMass2, double mass2) {

        if (guessMass2 == mass2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static double kickDoor(double mass2, double accel2, double force2) {

        if (accel2 < 2000 || accel2 > 5000) {

            return -1;

        }

        if (accel2 > 2000 && accel2 < 5000) {

            return 0;

        }

        return force2;
    }

    public static void calcLiters(double lbs, double guess) throws InventoryControlException {
        if (lbs < 1 || lbs > 50) {
            throw new InventoryControlException("The value must be >= 1 or <= 50.");
        }

        double liters = lbs / 2.2;

        double fillBottle = Math.round((liters / 2) * 100);

        fillBottle /= 100;

        if (guess != fillBottle) {
            throw new InventoryControlException("Your guess is incorrect.  Try again!");
        }
        

    }

   

    public static Inventory searchInventory(String itemName) throws InventoryControlException {

        Inventory[] items = Inventory.values();

        for (Inventory item : items) {
            if (itemName.equals(item.getItemName())) {
                return item;
            }

        }
        throw new InventoryControlException("Item not found");
    }
    

    public int findTotal() throws InventoryControlException {
       
        int total = 0;

        Item i = new Item();
        
        for (String item : i.items) {
            if (item != null) {
                total++;
                
                System.out.println(total);
            }     
          
        }
        if(total != 0)
        return total;
        else
        throw new InventoryControlException("There are no items in your inventory");

    }  
}
