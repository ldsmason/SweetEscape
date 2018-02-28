/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import java.util.Scanner;

/**
 *
 * @author nathanielmason
 */
class HelpMenuView {

    void displayHelpMenuView() {
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
       
       boolean valid = false;
       while (valid == false) {
           System.out.println("G - What is the goal of the game?\n" +
                              "M - How to move\n" +
                              "D -  Doors open \n" +
                              "T - Tools\n" +
                              "Q - Quit ");
           
           Scanner nameInput;
           nameInput = new Scanner(System.in);
           
           String name = nameInput.nextLine();
           
           String nameWithTrim = name.trim();
           
           if (inputs.length < 1) {
               System.out.println("You must enter a non-blank value");
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
      String menuItem = inputs[0];
       menuItem = inputs[0].toUpperCase();
       
       switch (menuItem) {
           case "G" : goalOfGame();
           break;
           case "M" : howToMove();
           break;
           case "D" : doorsOpen();
           break;
           case "T" : tools();
           case "Q" : return true;
           default : System.out.println("Invalid menu item"); 
           

    }
       return false;
    }

    private void goalOfGame() {
       System.out.println("*** goalOfGame called ***");
    }

    private void howToMove() {
       System.out.println("*** howToMove called ***");
    }

    private void doorsOpen() {
        System.out.println("*** doorsOpen called ***");
    }

    private void tools() {
        System.out.println("*** tools called ***");
    }
    
}
