/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;
import byui.cit260.sweetEscape.model.Door;
import byui.cit260.sweetEscape.model.Game;
import byui.cit260.sweetEscape.model.Location;
//import  byui.cit260.sweetEscape.control.DoorControl;
//import  byui.cit260.sweetEscape.control.inventoryControl;

import java.util.Scanner;
import sweetescape.SweetEscape;

/**
 *
 * @author nathanielmason   
 */
class GameMenuView extends View{

    public GameMenuView() {
    }
    


    @Override
    public String[] getInputs() {
       String[] inputs = new String[1];
       
      
           String menuItem = this.getInput("M - View Map\n" +
                              "I - View Inventory\n" +
                              "T - View list of tools\n" +
                              "V - Display Map" +
                              "P - Move the player\n" +
                              "O - opens the door\n" +
                              "C - opens Door Two\n" +
                              "D - opens Door Three\n" +
                              "F - open the final door\n" +
                              "E - Exit game menus\n" +
                              "S - Save Game\n" +
                              "H - Help\n" +
                              "Q - Quit ");
           
         
           inputs[0] = menuItem;
           return inputs;
           
      
    }

    @Override
    public boolean doAction(String[] inputs) {
       String menuItem = inputs[0];
       menuItem = inputs[0].toUpperCase();
       
       switch (menuItem) {
           case "M" : viewMap();
           break;
           case "I" : seeInventory();
           break;
           case "T" : seeTools();
           break;
           case "V" : this.displayMap();
           case "P" : movePlayer();
           break;
           case "O" : openDoor();
           break;
           case "C" : openDoorTwo();
           break;
           case "D" : openDoorThree();
           case "F" : openFinalDoor();
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
        toolMenuView.display();
    }
    
     private void movePlayer() {
        System.out.println("*** movePlayer called ***");
    }
    
    private void openDoor() {
      Door doors = new Door();
        
      OpenDoorView openDoorView = new OpenDoorView();
      
      openDoorView.display();
      System.out.println("*** openDoor called ***");
    }
    
    private void openDoorTwo() {
      Door doors = new Door();
        
      OpenDoorTwoView openDoorTwoView = new OpenDoorTwoView();
      
      openDoorTwoView.display();
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

    private void openDoorThree() {
        OpenDoorThreeView openDoorThreeView = new OpenDoorThreeView();
      
        openDoorThreeView.display();
    }
    
private void openFinalDoor() {
      FinalDoorView finalDoorView = new FinalDoorView();
      
      finalDoorView.display();
      System.out.println("*** openFinalDoor called ***");
    }

    private void displayMap() {
     Game game = SweetEscape.getCurrentGame();

     System.out.println("Sweet Escape Map");
    }

   

}   

   

