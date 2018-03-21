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
public class Question implements Serializable {
    
    
    
    
    private String question;
    private String answer;
    private String noToAnswer;
    private String yesToAnswer;
    private String invalidResponse;

    public Question() {
    }
    

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getNoToAnswer() {
        return noToAnswer;
    }

    public void setNoToAnswer(String noToAnswer) {
        this.noToAnswer = noToAnswer;
    }

    public String getYesToAnswer() {
        return yesToAnswer;
    }

    public void setYesToAnswer(String yesToAnswer) {
        this.yesToAnswer = yesToAnswer;
    }

    public String getInvalidResponse() {
        return invalidResponse;
    }

    public void setInvalidResponse(String invalidResponse) {
        this.invalidResponse = invalidResponse;
    }
    
    
}
