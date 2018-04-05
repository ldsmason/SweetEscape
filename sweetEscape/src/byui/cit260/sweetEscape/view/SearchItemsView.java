/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.InventoryControl;
import byui.cit260.sweetEscape.exceptions.InventoryControlException;
import byui.cit260.sweetEscape.model.Inventory;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nathanielmason
 */
class SearchItemsView extends View {

    //Inventory itemName;
    public SearchItemsView() {
    }
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        boolean valid = false;
       

       String item = this.getInput("Please enter the item you would like to find in inventory");
                   

        Scanner input;
        input = new Scanner(System.in);
        
        inputs[0] = item;
        
        

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
      String item = inputs[0];
      
        try {
            Inventory inventoryItem = InventoryControl.searchInventory(item); 
              System.out.println(inventoryItem.getItemDescription());
        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
      
      
        
        
        return true;
    }
}
