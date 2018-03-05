/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.DoorControl;
import java.util.Scanner;

/**
 *
 * @author nathanielmason
 */
class OpenDoorView {
    public void displayOpenDoorView(){
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
       //Scanner keyboard = new Scanner(System.in);
      
       //System.out.println("Please enter the Pin");
       //Scanner inFile;
       //inFile = new Scanner(System.in);
       
       String[] inputs = new String[1];
       boolean valid = false;
       while (valid == false) {
           System.out.println("Please enter the Paswword\n"
                             + "--------------\n"
                             + "| 1 | 2 | 3 |\n"
                             + "| 4 | 5 | 6 |\n"
                             + "| 7 | 8 | 9 |\n"
                             +     "| 0 |\n"
                             + "-------------");
           
           Scanner nameInput;
           nameInput = new Scanner(System.in);
           
           String name = nameInput.nextLine();
           
           String nameWithTrim = name.trim();
           
           if (inputs.length < 1) {
               System.out.println("You must enter a value");
               continue;
           }
           
           else {
               inputs[0] = nameWithTrim;
           valid = true;
           }
       }
      return inputs;
    }

    private boolean doAction(String[] inputs) {
      //double num = 1    ;
      
       System.out.println("Please enter a number");
      // DoorControl.calcKeypad();
       //System.out.print("Your number" + num);
       
       return true;
       
       

    }
       //return false;
  }
