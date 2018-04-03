/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.exceptions.MapControlException;
import byui.cit260.sweetEscape.model.Actor;
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
        inputs[0] = instructions;
        
       
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        int row = inputs[0];
        int column = inputs[1];
        
        try {
            row = Integer.parseInt(inputs[0]);
            column = Integer.parseInt(inputs[1]);
        }
        catch (NumberFormatException nfe) {
           System.out.println("The row and column must be a number");
           return false;
       }
        
        Player player = SweetEscape.getPlayer();
        Actor actor = SweetEscape.setPlayer(player);
        
        try {
            newLocation = moveActor(actor, row, column);
        }
        catch (MapControlException mce) {
            System.out.println("You enter coordinates off the map");
            return false;
        }
    }
    
}
