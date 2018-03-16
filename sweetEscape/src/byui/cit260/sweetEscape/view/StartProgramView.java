/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;
import byui.cit260.sweetEscape.model.*;
import byui.cit260.sweetEscape.control.GameControl;
import java.io.Serializable;
//import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chadh
 */
public class StartProgramView extends View{

    public StartProgramView() {
        
    }
    
  
    

    @Override
    public String[] getInputs() {
       String[] inputs = new String[1];
       
        //Display the welcome banner
        System.out.println("This adventure takes place in an abandoned warehouse in the middle "
                + "of North Korea.  You wake up in a dark room, dazed, confused, and unaware"
                + " how you got there.  The objective is to search the area and find a way to make a SWEET ESCAPE."
                + "  You will need to locate objects and other victims in order to escape.  "
                + "Each victim has strengths and weaknesses that will be needed to overcome specific challenges. \n" +
                  "Along the way there will be a variety of obstacles including (but not limited to) locked doors, puzzles.  "
                + "In order to defeat your enemies and overcome the obstacles, the user will need to invite others to join their "
                + "party and these people will be crucial to their survival.\n  ");
        
        String playersName = this.getInput("Enter player's name ");
        inputs[0] = playersName;
        
        return inputs;
    }
       
      

    @Override
    public boolean doAction(String[] inputs) {
       String playersName = inputs[0];
       Player player = GameControl.savePlayer(playersName);
       
       if (player == null) {
        System.out.println("Could not create the player." + 
                          "Enter a different name.");
        return false;
     
        }
    
       System.out.println("================================================="
                        + "\nWelcome to the game " + playersName
                        + "\nWe hope you have a lot of fun !  "
                        + "\nBut not really."
                        + "\n=================================================");
       MainMenuView mainMenuView = new MainMenuView();
       mainMenuView.display();
       
       return true;
       
     

    }
}
