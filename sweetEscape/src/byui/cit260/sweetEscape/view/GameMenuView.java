/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;
import byui.cit260.sweetEscape.model.Doors;
//import  byui.cit260.sweetEscape.control.DoorControl;
//import  byui.cit260.sweetEscape.control.inventoryControl;

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
           System.out.println("M - View Map\n" +
                              "I - View Inventory\n" +
                              "T - View list of tools\n" +
                              "P - Move the player\n" +
                              "O - opens the door\n" +
                              "C - opens Door Two\n" +
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
           case "P" : movePlayer();
           break;
           case "O" : openDoor();
           break;
           case "C" : openDoorTwo();
           break;
           case "Q" : quitGame();
           break;
           case "S" : saveGame();
           break;
           case "H" : getHelp();
           break;
           case "X" : explaoreLocation();
           break;
           case "E" : return true;
           default : System.out.println("Invalid menu item"); 
           

    }
       return false;
    }

    private void viewMap() {
        
        System.out.println("*** viewMap called ***");
    }

    private void seeInventory() {
        System.out.println("*** seeInventory called ***");
    }

    private void seeTools() {
        ToolMenuView toolMenuView = new ToolMenuView();
        toolMenuView.displayToolMenuView();
    }
    
     private void movePlayer() {
        System.out.println("*** movePlayer called ***");
    }
    
    private void openDoor() {
      Doors doors = new Doors();
        
      OpenDoorView openDoorView = new OpenDoorView();
      
      openDoorView.displayOpenDoorView();
      System.out.println("*** openDoor called ***");
    }
    
    private void openDoorTwo() {
      Doors doors = new Doors();
        
      OpenDoorTwoView openDoorTwoView = new OpenDoorTwoView();
      
      openDoorTwoView.displayOpenDoorTwoView();
      System.out.println("*** openDoorTwo called ***");
    }

    private void quitGame() {
           System.out.println("*** quitGame called ***");
    }


    private void saveGame() {
         System.out.println("*** saveGame called ***");
    }

    private void getHelp() {
        System.out.println("*** getHelp called ***");
    }

    private void explaoreLocation() {
        System.out.println("*** exploreLocation called ***");
    }

   

    

   


}
