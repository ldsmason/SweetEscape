/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;
import byui.cit260.sweetEscape.exceptions.GameControlException;
import byui.cit260.sweetEscape.model.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    
    if (player == null){
        return -1;
    }
        
    Game game = new Game();
    game.setPlayer(player);
    game.getPlayer().setActor(Actor.Jinseob);
    
    SweetEscape.setCurrentGame(game);
    
       
    
   
    
    Map map = MapControl.createMap(12, 12);//(row, column) where to intialize or put row variables
    if(map == null) {
        return -1;
    } 
      
   
    game.setMap(map);
    
    return 1;
  }
    
public static void saveGame(Game game, String filePath) throws GameControlException, IOException {
   if(game == null || filePath.length() < 1) {
       throw new GameControlException("game was inavild");
   }
   
   try (FileOutputStream out = new FileOutputStream(filePath)){
       try (ObjectOutputStream outObject = new ObjectOutputStream(out)) {
           outObject.writeObject(game);
       }
   }
   catch (IOException ex) {
       System.out.println("I/O Error: " + ex.getMessage());
   }
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

    public static void getGame(String filePath) throws GameControlException, IOException {
        Game game = null;
        
        if (filePath == null){
            throw new GameControlException("File cannot be null");
        }
        
        try(FileInputStream in = new FileInputStream(filePath)) {
            try (ObjectInputStream inObject = new ObjectInputStream(in)) {
                game = (Game) inObject.readObject();
                SweetEscape.setCurrentGame(game);
                SweetEscape.setPlayer(game.getPlayer());
            }
            catch (ClassNotFoundException ex) {
                System.out.println("Could not load game");
            }
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}
