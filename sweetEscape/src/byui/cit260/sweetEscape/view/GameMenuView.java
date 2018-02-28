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
class GameMenuView {

    public GameMenuView() {
    }
    
    public void displayGameMenuView() {
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
           System.out.println("M - View Map\n" +
                              "I - View Inventory\n" +
                              "T - View list of tools\n" +
                              "E - Exit game menus\n" +
                              "S - Save Game\n" +
                              "H - Help\n" +
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
           case "M" : viewMap();
           break;
           case "I" : seeInventory();
           break;
           case "T" : seeTools();
           break;
           case "Q" : quitGame();
           break;
           case "S" : saveGame();
           break;
           case "H" : getHelp();
           default : System.out.println("Invalid menu item"); 
           

    }
       return false;
    }

    private void viewMap() {
        
        System.out.println("viewMap called");
    }

    private void seeInventory() {
        System.out.println("seeInventory called");
    }

    private void seeTools() {
        System.out.println("seeTools called");
    }


    private void quitGame() {
           System.out.println("quitGame called");
    }


    private void saveGame() {
         System.out.println("saveGame called");
    }

    private void getHelp() {
        System.out.println("getHekp called");
    }


}
