/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.model;

/**
 *
 * @author nathanielmason
 */
public class DoorScene extends RegularSceneType{
    
    private String keyPad = "";

    public DoorScene() {
    }

    public DoorScene(String description, int inspectItem, int invalidLocation, String mapSymbol, String keyPad) {
        super(description, inspectItem, invalidLocation, mapSymbol);
        this.keyPad = keyPad;
    }

    public String getKeyPad() {
        return keyPad;
    }

    public void setKeyPad(String keyPad) {
        this.keyPad = keyPad;
    }
      
    
}
