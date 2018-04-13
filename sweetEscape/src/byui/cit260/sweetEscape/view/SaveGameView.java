/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.GameControl;
import byui.cit260.sweetEscape.exceptions.GameControlException;
import byui.cit260.sweetEscape.model.Game;
import java.io.IOException;
import sweetescape.SweetEscape;

/**
 *
 * @author nathanielmason
 */
public class SaveGameView extends View{

    @Override
    public String[] getInputs() {
         String[] inputs = new String[1];
        
        String mainInput = this.getInput("Type the path where you would like to save the game\n"
                                          + "Example C:/Users/tmp/save.dat"
                                          + "\n or Q - to go back\n"
                                          + "Enter the with the file name to save your current game ");
       
        inputs[0] = mainInput;
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
     String filePath = inputs[0];   
     Game game = SweetEscape.getCurrentGame();
     
     try {
         GameControl.saveGame(game, filePath);
     } 
     catch (GameControlException | IOException gme) {
         ErrorView.display(this.getClass().getName(),"Your game was not saved");
         return false;
     }
     
     this.console.println("Success! your file was saved as " + filePath );
     return true;
    }
    
}
