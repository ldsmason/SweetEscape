/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.inventoryControl;
import java.util.Scanner;
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
    double guessAccel;
    double lbs; 
    double guessMass2;
    double guessAccel2;
    double mass2 = lbs/2.2;

    public OpenDoorThreeView() {
        this.guessAccel = Double.parseDouble(inputs[0]);
        this.lbs = Double.parseDouble(inputs[1]);
        this.guessMass2  = Double.parseDouble(inputs[2]);
        this.guessAccel2  = Double.parseDouble(inputs[3]);
    }

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
    
    public boolean doAction(String[] inputs) {

        boolean valid = false;
        int guess = Integer.parseInt(inputs[0]);
        
        double code = inventoryControl.pickLock(mass, force, guessAccel);
        if (code == 0) {
            System.out.println("Way to go! You broke the lock!");
        } 
        else {
            System.out.println("Your guess is incorrect! 너 망했어!");
            valid = true;
        }
        return valid;
    }
        
    public String[] getInputs2() {
    
        String value = this.getInput(
                "The padlock is broken, but there is still " + force2 + " \n" 
              + "newtons of force needed to open the door.  Determine how much \n"
              + "acceleration is needed to kick open the door based on the mass\n"
              + "of your body and the amount of force needed to open the door.\n\n"
              + "First enter your weight in pounds:\n");
        
        inputs[1] = value;
        
        value = this.getInput (
                "Enter the mass of your body in kilograms. \n\n"
               +"The ratio of lbs to kg is 1 kg = 2.22 lbs\n");
        
        //lbs
        inputs[2] = value;
        
        
        value = this.getInput (
                "Using the same formula used to break the lock \n"
              + "(force = mass * accleration), and the mass of your body, now \n"
              + "find the acceleration needed to kick the door open.\n");
        
        //guessMass2
        inputs[3] = value;
         
        return inputs;

    }

    public boolean doAction2(String[] inputs) {

        boolean valid = false;
        int guess = Integer.parseInt(inputs[0]);
        
        double code = inventoryControl.checkMass(guessMass2, mass2);
        if (code == 0) {
            System.out.println("That is correct your mass is " + mass2 + "kg");
        } 
        else {
            System.out.println("Your guess is incorrect! 너 망했어!  Check "
                    + "your math and try again!");
            valid = true;
        }
        return valid;
    }

    /*boolean valid = false;
        double code = inventoryControl.kickDoor(mass, accel2);
               if (code == -1) {
                   System.out.println("Try again, your guess is incorrect!");
               }
               
               else if (code == -2) {
                   System.out.println("Try again, your guess is incorrect!");
               }
               else {
                   System.out.println("Way to go!  The door is now opened!");
                   valid = true;
               }
                
               return valid;*/
}
