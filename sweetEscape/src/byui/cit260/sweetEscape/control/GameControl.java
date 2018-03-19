/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;
import byui.cit260.sweetEscape.model.*;
//import byui.cit260.sweetEscape.control.*;
import sweetescape.SweetEscape;


/**
 *
 * @author nathanielmason
 */
public class GameControl  {
    
    public static Player savePlayer(String name) {
        Player player = new Player();
        player.setName(name);
        SweetEscape.setPlayer(player);
        
        if (name == null || name.length() < 1) {
            return null;
        }
        
        player = new Player();
        
       return player;     
    }
    
    public static int createNewGame(Player player) {
    //System.out.println("createNewGame is called");
    if (player == null){
        return -1;
    }
        
    Game game = new Game();
    game.setPlayer(player);
    SweetEscape.setCurrentGame(game);
       
    
    //Actor actor;
    //actor = Actor.Jinseob;
    // Actor jinseob = new Actor();
    
    //Inventory[] inventory;
    
    Map map = MapControl.createMap(12, 12);//(row, column) where to intialize or put row variables
    if(map == null) {
        return -1;
    } 
      
   
    game.setMap(map);
    
    return 1;
  }
    

    
   public static Door getCurrentDoor(){
       // Dummy code for doors to be implemented later
       Door door = new Door();
       door.setDescription("--------------\n"
                    + "| 1 | 2 | 3 |\n"
                    + "| 4 | 5 | 6 |\n"
                    + "| 7 | 8 | 9 |\n"
                    + "    | 0 |    \n"
                    + "-------------"
                    + "=================================================\n"
               + "\nEnter the four digit code");
 
       
       return door;
   }
}
