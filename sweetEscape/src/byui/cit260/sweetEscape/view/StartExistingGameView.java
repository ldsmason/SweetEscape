/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.GameControl;
import byui.cit260.sweetEscape.exceptions.GameControlException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nathanielmason
 */
public class StartExistingGameView extends View{

    public StartExistingGameView() {
    }

    /*void displayStartExistingGameView() {
       System.out.println("*** restartGame called");
    }*/

    @Override
    public String[] getInputs() {
         String[] inputs = new String[1];
        
        String mainInput = this.getInput("Type the name of the save game path you used to open the file"
        + "Example C:/Users/tmp/save.dat"
        + "\n or Q - to go back\n"
        + "\n==================================================\n"
        + "Enter the full file path for your save: ");
       
        inputs[0] = mainInput;
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
         String filePath = inputs[0];   
     
     
     try {
         GameControl.getGame(filePath);
     } 
     catch (GameControlException gme) {
         ErrorView.display(this.getClass().getName(),"Your save game was not found");
         return false;
     }  catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),ex.getMessage());
        }
     
     GameMenuView gameMenuView = new GameMenuView();
     gameMenuView.display();
     
     return true;
    }
    
}

