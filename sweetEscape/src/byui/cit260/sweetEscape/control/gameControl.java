/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;
import byui.cit260.sweetEscape.model.*;
import java.io.Serializable;
import sweetescape.SweetEscape;

/**
 *
 * @author nathanielmason
 */
public class gameControl implements Serializable {
    
    public static Player savePlayer(String name) {
        Player player = new Player();
        player.setName(name);
        SweetEscape.setPlayer(player);
        
        if (name == null) {
            return null;
        }
        
        player = new Player();
        
       return player;     
    }
    
    
}
