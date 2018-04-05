/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.MapControl;
import byui.cit260.sweetEscape.exceptions.MapControlException;
import byui.cit260.sweetEscape.model.Actor;
import byui.cit260.sweetEscape.model.Location;
import byui.cit260.sweetEscape.model.Player;
import sweetescape.SweetEscape;

/**
 *
 * @author nathanielmason
 */
public class MoveActorView extends View{

    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];
        
        String instructions = this.getInput("To move the player enter in coordinates for row and column.");
        String input1 = getInput("Enter the row");
        inputs[0] = input1;
        
        String input2 = getInput("Enter the Column");
        inputs[1] = input2;
        
       
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
       
        int newRow = 0;
        int newColumn = 0;
        try {
            newRow = Integer.parseInt(inputs[0]);
            newColumn = Integer.parseInt(inputs[1]);
        }
        catch (NumberFormatException nfe) {
           System.out.println("The row and column must be a number");
           return false;
       }
        
        Player player = SweetEscape.getPlayer();
        Actor actor = Actor.valueOf(player.getName());
        SweetEscape.setPlayer(player);
        
       
        
        try {
          Location newLocation = MapControl.movePlayer(actor, newRow, newColumn);
        }
        catch (MapControlException mce) {
            System.out.println("You entered coordinates off the map");
            return false;
        }
        
        System.out.println();
        
        return true;
    }
    
}
