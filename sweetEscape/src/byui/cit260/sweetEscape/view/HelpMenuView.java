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
class HelpMenuView extends View {

    

    @Override
    public String[] getInputs() {
      String[] inputs = new String[1];
       
      
           String menuItem = this.getInput("-----------------------\n" +
                              "       Help Menu       |\n" +
                              "-----------------------\n" +    
                              "G - What is the goal of the game?\n" +
                              "M - How to move\n" +
                              "D -  Doors open \n" +
                              "T - Tools\n" +
                              "Q - Quit ");
           inputs[0] = menuItem;
           
          
      return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
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
           default : this.console.println("Invalid menu item"); 
           

    }
       return false;
    }

    private void goalOfGame() {
       this.console.println(
               "\nYou have been kidnapped and taken to an abandoned warehouse in "
             + "\nthe middle of North Korea.  You wake up in a dark room, dazed,"
             + "\nconfused, and unaware of how you got there.  The objective "
             + "\nis to search the area and find a way to make a SWEET ESCAPE.  "
             + "\nThe user will need to locate objects and another victim in "
             + "\norder to escape.");
    }

    private void howToMove() {
       this.console.println(
               "Using the grid found on the map screen, enter coordinates to go "
               + "\nto your desired location.  There are some coordinates that "
               + "\nwill you will be unable to go to until those locations have "
               + "\nbeen unlocked.");
    }

    private void doorsOpen() {
        this.console.println(
                "In order to make your SWEET ESCAPE, there are three keys "
              + "\ntrapped behind locked doors that are going to need to opened "
              + "\nvia a variety of puzzles and challengs.  You will be able to "
              + "\nopen the doors by accessing items in your inventory.");
    }

    private void tools() {
        this.console.println(
                "As you make your daring SWEET ESCAPE, you will need several "
              + "\ntools and other objects to be used to unlock doors and obtain "
              + "\nother items.  You can access and view these tools in your "
              + "\ninventory.");
    }
    
}
