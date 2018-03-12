/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;
import byui.cit260.sweetEscape.control.inventoryControl;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author chadh
 */
public class OpenDoorTwoView { 
    
    int num = 0;
    Random rand = new Random();
    int lbs = (int) (rand.nextDouble() * 10);
    
    public void displayOpenDoorTwoView(){
        boolean endView = false;
        do {
                String[] inputs = getInputs();
       
                if (inputs[0].equals("Q")){
                   return; 
                }
                endView = doAction(inputs);
                
                }
        while (endView != true);
    }
        
        
    private String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;
        while (valid == false){
            
            /*User will be told value on wall, will need to enter 
             *amount of times must fill 2-liter bottle in order to 
             *open door
             */
            
            System.out.println("There is a number on the wall which reads " + lbs + " lbs. "
                + "\n You also see a scale and can see that buy placing a weight that"
                + "\n matches the number on the wall, you can open the door.  Using"
                + "\n the 2-liter bottle and the sand in your inventory,  determine"
                + "\n the number of times needed to fill the bottle in order to open"
                + "\n the door.  The ratio is 2.2 L/lb. \n\n Please enter the number of times needed to fill"
                + "\n bottle with sand. "
                    + "\n\n Remember that there are two liters in the bottle and \n"
                    + "take this into account when finding the answer.");
       
            Scanner inFile = new Scanner(System.in);
            String guess = inFile.nextLine();
            guess = guess.trim();
            if (inputs.length < 1) {
                System.out.println("You must enter a value");
                continue;
            }
                inputs[0] = guess;
                valid = true;
                
         
        }
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
        boolean valid = false;
        int guess = Integer.parseInt(inputs[0]);
        
        double code = inventoryControl.calcLiters(lbs, guess);
               if (code == -1) {
                   System.out.println("Try again, lbs is invalid!");
               }
               
               else if (code == -2) {
                   System.out.println("Try again, your guess is incorrect!");
               }
               else {
                   System.out.println("Way to go!  The door is now opened!");
                   valid = true;
               }
                
       
       
       return valid;
    }
    
    private void calcLiters() {
        System.out.println("Great Job!");
    }

    
    
}
