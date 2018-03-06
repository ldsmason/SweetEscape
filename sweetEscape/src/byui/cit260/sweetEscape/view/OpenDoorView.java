/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.DoorControl;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nathanielmason
 */
class OpenDoorView {
    public void displayOpenDoorView(){
        boolean endView = false;
        do {
               boolean inputs = getInputs();
                
                if (inputs != true) {
                    return;
                }
                endView = doAction();
                
                }
        while (endView != true);
        
    }

    private boolean getInputs() {
       boolean valid = false;
       
       Random rand = new Random();
       double num = rand.nextDouble();
     
       //System.out.println("You see written all over the wall the number " + num);
       
       while (valid == false) {
           System.out.println("--------------\n"
                             + "| 1 | 2 | 3 |\n"
                             + "| 4 | 5 | 6 |\n"
                             + "| 7 | 8 | 9 |\n"
                             + "    | 0 |    \n"
                             + "-------------");
           
           System.out.println("=================================================");
           System.out.println("Enter a code");
           Scanner input;
           input = new Scanner(System.in);
           double answer = input.nextDouble();
           System.out.println("=================================================");
           
           double length = String.valueOf(answer).length();
           
           if (length != 4) {
               System.out.println("try again the number was too high");
               System.out.println("=================================================");
               continue;
           }
           else  {
               long code = DoorControl.calcKeypad(num);
               if (code < 10000){
                   break;
               }
             if (code > 10000) {
                 System.out.println("try again");
             }
           }
       }
      return true;
    }

    private boolean doAction() {
      
       System.out.println("the door opens");
      // DoorControl.calcKeypad();
       //System.out.print("Your number" + num);
       
       return true;
       
       

    }
       //return false;
  }
