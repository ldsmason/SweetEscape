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
 * @author nathanielmason
 */
public class RegularSceneType implements Serializable {
    
        private String description;
        private int inspectItem;
        private int invalidLocation;
        private String mapSymbol;

    public RegularSceneType() {
        
    }

    public RegularSceneType(String description, int inspectItem, int invalidLocation, String mapSymbol) {
        this.description = description;
        this.inspectItem = inspectItem;
        this.invalidLocation = invalidLocation;
        this.mapSymbol = mapSymbol;
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

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + this.inspectItem;
        hash = 23 * hash + this.invalidLocation;
        hash = 23 * hash + Objects.hashCode(this.mapSymbol);
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
        final RegularSceneType other = (RegularSceneType) obj;
        if (this.inspectItem != other.inspectItem) {
            return false;
        }
        if (this.invalidLocation != other.invalidLocation) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "RegularSceneType{" + "description=" + description + ", inspectItem=" + inspectItem + ", invalidLocation=" + invalidLocation + ", mapSymbol=" + mapSymbol + '}';
    }

        
}
