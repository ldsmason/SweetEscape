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
public class QuestionSceneType extends RegularSceneType {
    Question question;
    
    public QuestionSceneType() {
        
    }

    public QuestionSceneType(Question question, String description, int inspectItem, int invalidLocation, String mapSymbol) {
        super(description, inspectItem, invalidLocation, mapSymbol);
        this.question = question;
    }
    
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
    
    
}
