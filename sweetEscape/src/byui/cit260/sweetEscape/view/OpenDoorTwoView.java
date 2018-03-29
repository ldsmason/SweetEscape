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
public class OpenDoorTwoView extends View { 
    
    int num = 0;
    Random rand = new Random();
    
        
    int lbs = (int) (rand.nextDouble() * 10);
        
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
            
            /*User will be told value on wall, will need to enter 
             *amount of times must fill 2-liter bottle in order to 
             *open door
             */
            
            String guess = this.getInput("There is a number on the wall which reads " + lbs + " lbs. "
                + "\n You also see a scale and can see that buy placing a weight that"
                + "\n matches the number on the wall, you can open the door.  Using"
                + "\n the 2-liter bottle and the sand in your inventory,  determine"
                + "\n the number of times needed to fill the bottle in order to open"
                + "\n the door.  The ratio is 2.2 L/lb. \n\n Please enter the number of times needed to fill"
                + "\n bottle with sand. "
                    + "\n\n Remember that there are two liters in the bottle and \n"
                    + "take this into account when finding the answer.  Round to \n"
                    + "two decimals.");
       
            /*Scanner inFile = new Scanner(System.in);
            String guess = inFile.nextLine();
            guess = guess.trim();*/
            
                inputs[0] = guess;
                
        

                return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        
        double guess = Double.parseDouble(inputs[0]);
        
        try {
            InventoryControl.calcLiters(lbs, guess);
            System.out.println("The door's open!  Let's go!");
            return true;
            
        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
    }
    
    private void calcLiters() {
        System.out.println("Great Job!");
    }

    
    
}
