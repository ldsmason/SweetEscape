/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author chadh
 */
public class Game implements Serializable {
    
    // class instance variables
    private double totalTime;
    private Player player;

    public Game() {
    }
    

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
}
