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
    public void displayOpenDoorTwoView(){
        boolean endView = false;
        do {
                String[] inputs = this.getInputs();
                String value = inputs[0].toUpperCase();
                
                if (inputs.length < 1 || value.equals("Q")){
                   return; 
                }
                endView = doAction(inputs);
                
                }
        while (endView != true);
    }
        
        
        
    private String[] getInputs() {
        String[] inputs = new String[1];
        Random rand = new Random();
        int lbs = (int) (rand.nextDouble() * 10);
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
                + "\n bottle with sand. ");
       
            Scanner inFile = new Scanner(System.in);
            double guess = inFile.nextDouble();
            if (inputs.length < 1) {
                System.out.println("You must enter a value");
            }
            else {
                inputs[0] = Double.toString(guess);
                inputs[1] = Double.toString(lbs);
                valid = true;
            }           
        }
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
       int guess = Integer.parseInt(inputs[0]);
       long code = inventoryControl.calcLiters(this.num);
               if (guess >= 50 || guess <=1) {
                   System.out.println("Try again, the number is too high!");
               }
               else if (guess <=1) {
                   System.out.println("Try again, the number is too low!");
               }
               else {
                   String numberAsString = Integer.toString(num);
                   return guess;
               }
                
       String menuItem = inputs[0];
       menuItem = inputs[0].toUpperCase();
       switch (menuItem) {
           case "Enter" : calcLiters();
           break;
           case "Q" : return true;
           default : System.out.println("Invalid menu item");
       }
       return false;
    }
    
    private void calcLiters() {
        System.out.println("Great Job!");
    }

    
    
}
