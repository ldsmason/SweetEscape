/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.model;
import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author chadh
 */
public class Map implements Serializable {
    
    Point point;
    private String row;
    private String column;
    public static boolean visited;
    private double amountRemaining;
    Location playerLoc;
    Location[][] locations;

    public Map() {
    }

    public Map(Point point, String row, String column, boolean visited, double amountRemaining, Location playerLoc) {
        this.point = point;
        this.row = row;
        this.column = column;
        Map.visited = visited;
        this.amountRemaining = amountRemaining;
        this.playerLoc = playerLoc;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
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

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public Location getPlayerLoc() {
        return playerLoc;
    }

    public void setPlayerLoc(Location playerLoc) {
        this.playerLoc = playerLoc;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.point);
        hash = 71 * hash + Objects.hashCode(this.row);
        hash = 71 * hash + Objects.hashCode(this.column);
        hash = 71 * hash + (this.visited ? 1 : 0);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.amountRemaining) ^ (Double.doubleToLongBits(this.amountRemaining) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.playerLoc);
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
        final Map other = (Map) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.point, other.point)) {
            return false;
        }
        if (!Objects.equals(this.playerLoc, other.playerLoc)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "point=" + point + ", row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + ", playerLoc=" + playerLoc + '}';
    }

    
    

   
   
}