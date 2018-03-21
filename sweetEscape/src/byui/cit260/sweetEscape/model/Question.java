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
    
    OpenDoor ("Would you like to open the door?", "Yes", "No"),
    GrabItem ("Would you like to grab the item?", "Yes", "No");
    
    private String question;
    private String answer;
    private String invalidResponse;
    
    private Question(String question, String answer, String invalidResponse) {
        this.question = question;
        this.answer = answer;
        this.invalidResponse = invalidResponse;
    }

    public String getAnswer() {
        return answer;
    }

    public String getInvalidResponse() {
        return invalidResponse;
    }



    
    
    
}
