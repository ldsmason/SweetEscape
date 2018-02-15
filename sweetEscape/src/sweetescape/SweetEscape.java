/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweetescape;
import byui.cit260.sweetEscape.model.Player;
import byui.cit260.sweetEscape.model.Doors;
import byui.cit260.sweetEscape.model.RegularSceneType;
import byui.cit260.sweetEscape.model.Question;
import byui.cit260.sweetEscape.model.Actor;
import byui.cit260.sweetEscape.model.Inventory:
import byui.cit260.sweetEscape.model.Map;
import byui.cit260.sweetEscape.model.Location;
import java.io.Serializable;
import java.awt.Point;


/**
 *
 * @author nathanielmason
 */
public class SweetEscape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       Doors doorOne = new Doors();
       RegularSceneType theDescription = new RegularSceneType();
       Question response = new Question();
       Actor actorOne = new Actor();
       
       actorOne.setName("Jinseob");
       actorOne.setDescription("He is also trapped, but he speaks Korean.");
       actorOne.setCoordinates(new Point(5,6));
       
       String actorOneName = actorOne.getName();
       String actorOneDescription = actorOne.getDescription();
       Point actorOneCoordinates = actorOne.getCoordinates();
       
       System.out.println("Name = " + actorOneName + ", " + actorOneDescription
                            + ", " + actorOneCoordinates);
       
       playerOne.setName("Stephen McMansley");
       playerOne.setBestTime(7.00);
       
       String playerOneName = playerOne.getName();
       double playerOneTime = playerOne.getBestTime();
       
       System.out.println("Name = " + playerOneName +
                          ", time = " + playerOneTime);
       
       doorOne.setDoorNumber(1);
       double doorOneDoorNumber = doorOne.getDoorNumber();
       
       System.out.println("Door = " + doorOneDoorNumber);
       
       theDescription.setDescription("hammer");
       String itemDescription = theDescription.getDescription();
       
       System.out.println("The item is a " + itemDescription);
       
       response.setAnswer("yes");
       String theAnswer = response.getAnswer();
       
       System.out.println("The answer is " + theAnswer);
       
       
    }
    
}
