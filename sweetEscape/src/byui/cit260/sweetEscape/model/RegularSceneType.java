/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.model;
import java.io.Serializable;

/**
 *
 * @author nathanielmason
 */
public class RegularSceneType implements Serializable {
    
        private String description;
        private int inspectItem;
        private int invalidLocation;
        private int mapSymbol;

    public RegularSceneType() {
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInspectItem() {
        return inspectItem;
    }

    public void setInspectItem(int inspectItem) {
        this.inspectItem = inspectItem;
    }

    public int getInvalidLocation() {
        return invalidLocation;
    }

    public void setInvalidLocation(int invalidLocation) {
        this.invalidLocation = invalidLocation;
    }

    public int getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(int mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

        
}
