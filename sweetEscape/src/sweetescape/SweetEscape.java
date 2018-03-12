/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweetescape;
import byui.cit260.sweetEscape.model.*;
import byui.cit260.sweetEscape.view.*;
import java.io.Serializable;
import java.awt.Point;


/**
 *
 * @author nathanielmason
 */
public class SweetEscape implements Serializable{

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
       /*Player playerOne = new Player();
       Doors doorOne = new Doors();
       RegularSceneType theDescription = new RegularSceneType();
       Question response = new Question();
       Actor.Jinseob.getName();
       Inventory.Hammer.getItemName();
       Map map = new Map();
       
       Inventory.Hammer.setItemName("derp");
       System.out.println(Inventory.Hammer.getItemName());
      
       map.setPoint(new Point (1,0));
       map.setPlayerLoc(new Location());
       map.getPlayerLoc().setColumn("5");
       map.getPlayerLoc().setRow("1");
       System.out.println(map.getPlayerLoc().getColumn());
       System.out.println(map.getPlayerLoc().getRow());
       Actor.Jinseob.setName("Korean");
       System.out.println(Actor.Jinseob.getName());
       
       
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
       
       System.out.println("The answer is " + theAnswer);*/
       
      StartProgramView startProgramView = new StartProgramView();
      startProgramView.display();
      
       
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SweetEscape.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SweetEscape.player = player;
    }
    
}
