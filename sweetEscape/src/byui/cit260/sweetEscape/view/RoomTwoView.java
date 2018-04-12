/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.model.Inventory;
import java.util.ArrayList;

/**
 *
 * @author chadh
 */
public class RoomTwoView extends View {

    public RoomTwoView() {
    }

    @Override
    public String[] getInputs() {
          String[] inputs = new String[1];
          String value = this.getInput("Would you like to pick up the red key and hammer. Y or N");
          inputs[0] = value;
          
          return inputs;
          
    }

    @Override
    public boolean doAction(String[] inputs) {
        String value = inputs[0];
       value = inputs[0].toUpperCase();
    
       if (value.equals("Y")) {
          ArrayList<Inventory> itemsFound = new ArrayList<>();     
          itemsFound.add(Inventory.RedKey);
          itemsFound.add(Inventory.Hammer);
       }
       else {
           this.console.println("You don't pick up the item");
           //return false;
       }
       this.console.println("You pick up the items and put them in your bag");
       return true;
}
}
