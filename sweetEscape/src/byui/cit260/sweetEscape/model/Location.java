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
    
    private int row;
    private int column;
    private boolean alreadyVisited = false;
    
    public Location(){
        
    }

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isAlreadyVisited() {
        return alreadyVisited;
    }

    public void setAlreadyVisited(boolean alreadyVisited) {
        this.alreadyVisited = alreadyVisited;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.row;
        hash = 37 * hash + this.column;
        hash = 37 * hash + (this.alreadyVisited ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.alreadyVisited != other.alreadyVisited) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", alreadyVisited=" + alreadyVisited + '}';
    }

    



    
    
    
    
}
