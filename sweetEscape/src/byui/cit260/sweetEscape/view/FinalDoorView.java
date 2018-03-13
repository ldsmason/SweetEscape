/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

/**
 *
 * @author nathanielmason
 */
public class FinalDoorView extends View  {

    public FinalDoorView() {
    }
    
     public String[] getInputs() {
       String[] inputs = new String[1];
       
        //Display the welcome banner
        System.out.println("Welcome to the final door ");
        
        String keys = this.getInput("Would you like to open the door " +
                                   "\n Please enter Yes or No");
        inputs[0] = keys;
        
        return inputs;
    }
       
      

    public boolean doAction(String[] inputs) {
   String keys = inputs[0];
      
    if (inputs[0].equals("R")) {
    System.out.println("The red key fits and unlocks the first lock\n"
                 + "Please enter the blue key");

    if (inputs[0].equals("B"))   {
    System.out.println("The blue key fits and unlocks the first lock\n"
                                   + "Please enter the green key");

        }
        if (inputs[0].equals("G")) {
           System.out.println("The greee key fits and unlocks the first lock\n"
                                   + "The door unlocks");

        }

    else if (inputs[0] != "R") {
 	System.out.println("Please enter a valid value");
        return false;
        }

    }
        return true;
  }
}

      

