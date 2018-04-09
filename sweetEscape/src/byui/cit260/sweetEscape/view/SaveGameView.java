/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.GameControl;
import byui.cit260.sweetEscape.exceptions.GameControlException;
import byui.cit260.sweetEscape.model.Game;
import sweetescape.SweetEscape;

/**
 *
 * @author nathanielmason
 */
public class SaveGameView extends View{

    @Override
    public String[] getInputs() {
         String[] inputs = new String[1];
        
        String instructions = this.getInput("To save game enter the name you want it to be saved under");
        String input1 = getInput("Enter the name");
        inputs[0] = input1;
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
     String filePath = inputs[0];   
     Game game = SweetEscape.getCurrentGame();
     
     try {
         GameControl.saveGame(game, filePath);
     } 
     catch (GameControlException gme) {
         System.out.println("Your game was not saved");
         return false;
     }
     
     this.console.println("Success! your files was saved as " + filePath );
     return true;
    }
    
}
