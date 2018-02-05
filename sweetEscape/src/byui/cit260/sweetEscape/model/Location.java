/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author chadh
 */
public class Location implements Serializable {
    
    private String row;
    private String column;
    private ArrayList<Game> alreadyVisited = new ArrayList<Game>();
    private ArrayList<Game> amountRemaining = new ArrayList<Game>();
    
    public Location(){
        
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public ArrayList<Game> getAlreadyVisited() {
        return alreadyVisited;
    }

    public void setAlreadyVisited(ArrayList<Game> alreadyVisited) {
        this.alreadyVisited = alreadyVisited;
    }

    public ArrayList<Game> getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(ArrayList<Game> amountRemaining) {
        this.amountRemaining = amountRemaining;
    }
    
    
    
    
}
