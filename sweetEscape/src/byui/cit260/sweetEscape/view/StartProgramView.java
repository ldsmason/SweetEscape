/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;
import byui.cit260.sweetEscape.model.*;
import byui.cit260.sweetEscape.control.*;
import java.io.Serializable;
//import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chadh
 */
public class StartProgramView implements Serializable{

    public StartProgramView() {
        
    }
    
    //private ArrayList<StartProgramView> inputs = new ArrayList<StartProgramView>();
    
    public void displayPublicStartView(){
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
       
        //Display the welcome banner
        /*System.out.println("This adventure takes place in an abandoned warehouse in the middle "
                + "of Central America.  User wakes up in a dark room, dazed, confused, and unaware"
                + " how they got there.  The objective is to search the area and find a way to GET OUT."
                + "  The user will need to locate objects and other victims in order to escape.  "
                + "Each victim has strengths and weaknesses that will be needed to overcome specific challenges. \n" +
                  "Along the way there will be a variety of obstacles including (but not limited to) locked doors, puzzles.  "
                + "In order to defeat your enemies and overcome the obstacles, the user will need to invite others to join their "
                + "party and these people will be crucial to their survival.  ");*/
       
       boolean valid = false;
       
       while (valid == false){
           //Display the prompt message
           System.out.println("Enter player's name");
           
           Scanner nameInput;
           nameInput = new Scanner(System.in);
           
           String name = nameInput.nextLine();
           
           String nameWithTrim = name.trim();
           
           if (nameWithTrim.length() < 1){
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
       mainMenuView.displayMainMenuView();
       
       return true;
       
     

    }
}
