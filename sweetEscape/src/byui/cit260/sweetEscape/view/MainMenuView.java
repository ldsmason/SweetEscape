/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.model.Game;
import byui.cit260.sweetEscape.control.*;
import byui.cit260.sweetEscape.exceptions.MapControlException;
import java.util.Scanner;
import sweetescape.SweetEscape;

/**
 *
 * @author nathanielmason
 */
public class MainMenuView extends View {

    public MainMenuView() {
    }
    
    
  

    @Override
    public String[] getInputs() {
       String[] inputs = new String[1];
       
       
           String menuItem = this.getInput("N - Start new game \n" +
                              "R - Restart saved game\n" +
                              "H - Get help on how to play the game\n" +
                              "E - Exit  ");
           
           inputs[0] = menuItem;
           return inputs;
           
    }

    @Override
    public boolean doAction(String[] inputs) {
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
           default :  this.console.println("Invalid menu item"); 
           

    }
       return false;
  }

    private void startNewGame() /*throws MapControlException*/ {
      Game game = new Game();
      
      try {
      GameControl.createNewGame(SweetEscape.getPlayer());
      }
      /*catch (MapControlException mce) {
          System.out.println(mce.getMessage());
          return;
       } */
      catch (Throwable te) {
           System.out.println(te.getMessage());
           te.printStackTrace();
           return;
       }

      GameMenuView gameMenuView = new GameMenuView();
      gameMenuView.display();
       
       
    }

    private void restartGame() {
         StartExistingGameView  startExistingGameView = new StartExistingGameView();
         startExistingGameView.display();
    }

    private void getHelp() {
         HelpMenuView helpMenuView = new HelpMenuView();
         helpMenuView.display();
    }
}

