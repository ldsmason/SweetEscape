/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author chadh
 */
public enum Actor implements Serializable {
    
    Jinseob("Jinseob", "He is also trapped, but he speaks Korean.", new Point(0,0));
    
    private String name;
    private String description;
    private Point coordinates;

    private Actor() {
        
    }
    
  
    
    Actor(String name, String description, Point coordinates) {
        this.name = name;
        this.description = description;
        this. coordinates = coordinates;
        
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
    
}
