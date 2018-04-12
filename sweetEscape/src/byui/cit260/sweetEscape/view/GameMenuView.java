/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;
import byui.cit260.sweetEscape.model.Door;
import byui.cit260.sweetEscape.model.Game;
import byui.cit260.sweetEscape.model.Location;
import byui.cit260.sweetEscape.model.Map;
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
       
      
           String menuItem = this.getInput(
                              "-----------------------\n" +
                              "       Game Menu       |\n" +
                              "-----------------------\n" + 
                              "M - Display Map\n" +
                              "W - Move Player\n"   +     
                              "I - View Inventory\n" +
                              "T - View list of tools\n" +
                              "P - Move the player\n"
                            + "A - Open Door One\n" +
                              "O - opens the door\n" +
                              "C - opens Door Two\n" +
                              "D - opens Door Three\n" +
                              "F - open the final door\n" +
                              "K - print report \n" +
                              "R - Room Two explore\n" +
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
           case "M" : this.displayMap();
           break;
           case "W" : moveActor();
           break;
           case "I" : seeInventory();
           break;
           case "T" : seeTools();
           break;
           case "L" : searchInventory();
           break;
           case "P" : movePlayer();
           break;
           case "A" : openDoorOne();
           break;
           case "K" : printReport();
           break;
           case "O" : openDoor();
           break;
           case "C" : openDoorTwo();
           break;
           case "D" : openDoorThree();
           break;
           case "F" : openFinalDoor();
           break;
           case "Q" : quitGame();
           break;
           case "S" : saveGame();
           break;
           case "H" : getHelp();
           break;
           case "R" : explaoreLocation();
           break;
           case "E" : return true;
           default : System.out.println("Invalid menu item"); 
           

    }
       return false;
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
     
    }
    
    private void openDoorTwo() {
      Door doors = new Door();
        
      OpenDoorTwoView openDoorTwoView = new OpenDoorTwoView();
      
      openDoorTwoView.display();
      
    }

    private void quitGame() {
           System.out.println("*** quitGame called ***");
    }


  private void saveGame() {
    SaveGameView saveGameView = new SaveGameView();
    saveGameView.display();
  }

    private void getHelp() {
      HelpMenuView helpMenuView = new HelpMenuView();
      
      helpMenuView.display();
    }

    private void explaoreLocation() {
      RoomTwoView roomTwoView = new RoomTwoView();
      
      roomTwoView.display();
    }

    private void openDoorThree() {
        OpenDoorThreeView openDoorThreeView = new OpenDoorThreeView();
      
        openDoorThreeView.display();
    }
    
private void openFinalDoor() {
      FinalDoorView finalDoorView = new FinalDoorView();
      
      finalDoorView.display();
      
    }

    private void displayMap() {
     Game game = SweetEscape.getCurrentGame();
    // Location[][] locations = new Location[12][12];   
  
    this.console.println("Sweet Escape Map\n");
     this.console.println("   1  2  3  4  5  6  7  8  9  10  11  12\n" +
                        "-----------------------------------------");
     
     Location[][] locations = game.getMap().getLocations();
     int num = 1;
     for (int i = 0; i < locations.length; i++) {
          this.console.println();
          this.console.print(num++ + "|");
         
          for (int j = 0; j < locations[i].length; j++) {
              Location location = locations[i][j];
              if(location.isAlreadyVisited()) {
                  String mapSymbol = location.getScene().getMapSymbol();
                  System.out.print(mapSymbol);
              }
              else {
                  this.console.print("??");
              }
              this.console.print("|");
              
         
          }
          
          
      }
     this.console.println("\n-----------------------------------------");
    }

   private void searchInventory() {
    SearchItemsView searchItemsView = new SearchItemsView();
    searchItemsView.display();
   }

    private void moveActor() {
        MoveActorView moveActorView = new MoveActorView();
      
        moveActorView.display(); 
    }

    private void openDoorOne() {
        OpenDoorOneView openDoorOneView = new OpenDoorOneView();
        openDoorOneView.display();
    }

    private void printReport() {
        PrintReportView printReportView = new PrintReportView();
        printReportView.display();
    }

   

}   

   

