/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

/*import byui.cit260.sweetEscape.control.DoorControl;
import byui.cit260.sweetEscape.control.GameControl;
import byui.cit260.sweetEscape.model.Door;*/
import java.util.ArrayList;
import java.util.Random;
//import java.util.Scanner;

/**
 *
 * @author nathanielmason
 */
class FinalDoorView extends View {
    
        private String[] randomLetters = new String[3];
        private ArrayList<String> values = new ArrayList();

    public FinalDoorView() {
        Random randomGenerator = new Random();
        this.randomLetters = new String[3];
        
        this.values.add("R");
        this.values.add("G");
        this.values.add("B");
        
        int index = randomGenerator.nextInt(3);
        this.randomLetters[0] = values.get(index);
        values.remove(index);

        index = randomGenerator.nextInt(2);
        this.randomLetters[1] = values.get(index);
        values.remove(index);

        this.randomLetters[2] = values.get(0);
        
    }
    
    



        @Override
    public String[] getInputs() {
        String[] inputs = new String[3];

        System.out.println("Welcome to the Final Door\n");


        String doorKey = this.getInput("Enter the first key: ").toUpperCase();
        inputs[0] = doorKey;
        
        doorKey = this.getInput("Enter the Second key: ").toUpperCase();
        inputs[1] = doorKey;
        
        doorKey = this.getInput("Enter the Third key: ").toUpperCase();
        inputs[2] = doorKey;

        return inputs;

    }

        @Override
    public boolean doAction(String[] inputs) {

        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();

        if (   inputs[0].equals(this.randomLetters[0])
            && inputs[1].equals(this.randomLetters[1])
            && inputs[2].equals(this.randomLetters[2]) ) {
            
            // print out you win
            System.out.println("The door unlocks and you have escaped\n"
                               + "Congratulations you win!");
            return true;
        }
        else if (!inputs[0].equals(this.randomLetters[0])
            && !inputs[1].equals(this.randomLetters[1])
            && !inputs[2].equals(this.randomLetters[2]) ){
             
            // print you did not win try again
            System.out.println("Try again.\n" +
                               "You entered the keys in the wrong order\n");
            
            return false;
        }
        
        
   
        return false;
    }

}
