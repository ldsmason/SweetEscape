/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.model.Game;
import java.util.Scanner;

/**
 *
 * @author nathanielmason
 */
public class MainMenuView {
    
    public void displayMainMenuView() {
        boolean endView = false;
        do {
                String[] inputs = this.getInputs();
                String value = inputs[0].toUpperCase();
                
                if (inputs.length < 1 || value.equals('Q')){
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
           System.out.println("N - Start new game \n" +
                              "R - Load saved game\n" +
                              "H - Get help on how to play the game\n" +
                              "E - Exit  ");
           
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
           case "N" : startNewGame();
           break;
           case "R" : restartGame();
           break;
           case "H" : getHelp();
           break;
           case "E" : return true;
           default : System.out.println("Invalid menu item"); 
           

    }
       return false;
  }

    private void startNewGame() {
      Game game = new Game();
      
       GameMenuView gameMenuView = new GameMenuView();
       gameMenuView.displayGameMenuView();

    }

    private void restartGame() {
         System.out.println("**** restartGame() called ***");
    }

    private void getHelp() {
         System.out.println("**** getHhelp() called ***");
    }
}

