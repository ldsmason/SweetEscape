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
public enum Question implements Serializable {
    
    OpenDoor ("Would you like to open the door?"),
    Movement ("Where would you like to go?"),
    Inspect ("What area of the room would you like to inspect"),
    GrabItem ("Would you like to grab the item?"),
    UseItem ("What item would you like to use?");
    
    private String question;
    private String answer;
    private String noToAnswer;
    private String yesToAnswer;
    private String invalidResponse;

    private Question() {
    }
    
    Question (String question) {
        this.question = question;
    }
    

    
    
    
}
