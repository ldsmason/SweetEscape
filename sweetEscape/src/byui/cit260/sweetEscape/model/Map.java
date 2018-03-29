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
    private int rows;
    private int columns;
    public static boolean visited;
    private double amountRemaining;
    Location playerLoc;
    Location[][] locations;

    public Map() {
    }

    public Map(Point point, int rows, int columns, boolean visited, double amountRemaining, Location playerLoc) {
        this.point = point;
        this.rows = rows;
        this.columns = columns;
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

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
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
        hash = 71 * hash + Objects.hashCode(this.rows);
        hash = 71 * hash + Objects.hashCode(this.columns);
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
        if (!Objects.equals(this.rows, other.rows)) {
            return false;
        }
        if (!Objects.equals(this.columns, other.columns)) {
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
        return "Map{" + "point=" + point + ", row=" + rows + ", column=" + columns + ", visited=" + visited + ", amountRemaining=" + amountRemaining + ", playerLoc=" + playerLoc + '}';
    }

    
    

   
   
}