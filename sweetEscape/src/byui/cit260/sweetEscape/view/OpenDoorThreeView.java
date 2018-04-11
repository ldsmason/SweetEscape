/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.InventoryControl;
import byui.cit260.sweetEscape.exceptions.InventoryControlException;
import java.util.Random;


/**
 *
 * @author chadh
 */
public class OpenDoorThreeView extends View {

    int num = 0;
    Random rand = new Random();
    double mass = Math.round((rand.nextDouble() * 10)*100)/100;
    double force = Math.round(rand.nextDouble() * 1000);
    double force2 = Math.round(rand.nextDouble() * 10000);
    String[] inputs = new String[4];

    @Override
    public String[] getInputs() {
        
        
        String value = this.getInput(
                "The door is locked with a padlock.  Using the driftpin \n"
              + "and the hammer in your inventory, determine the amount \n"
              + "of acceleration needed to break the lock pick if " + force + " \n"
              + "newtons of force is needed.\n\n"
              + "The mass of the hammer is " + mass + " grams.\n\n"
              + "The equation to find force is: \n\n"
                    + "force = mass * accleration\n");
        
        //guessAccel
        inputs[0] = value;
        
        
        return inputs;
    }
    
    
    
    @Override
    public boolean doAction(String[] inputs) {
        
        double guessAccel = Double.parseDouble(inputs[0]);
       
        try {
            InventoryControl.pickLock(mass, force, guessAccel); 
            System.out.println("------------------------------" + 
                                "Way to go you broke the lock!" +
                                "The Door's open!" +
                                "------------------------------");
            return true;
        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
       
  
    }
}
    
        

    
