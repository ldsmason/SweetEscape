/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;
import byui.cit260.sweetEscape.exceptions.MapControlException;
import byui.cit260.sweetEscape.model.Actor;
import byui.cit260.sweetEscape.model.Game;
import byui.cit260.sweetEscape.model.Inventory;
import byui.cit260.sweetEscape.model.Location;
import byui.cit260.sweetEscape.model.Map;
import byui.cit260.sweetEscape.model.Question;
import byui.cit260.sweetEscape.model.QuestionSceneType;
import byui.cit260.sweetEscape.model.RegularSceneType;
import byui.cit260.sweetEscape.model.RoomScene;
import byui.cit260.sweetEscape.model.SceneType;
import java.awt.Point;
import java.util.ArrayList;
import sweetescape.SweetEscape;
/**
 *
 * @author nathanielmason
 */
public class MapControl {


    public MapControl() {
    }
    
    public static Map createMap( int noOfRows,int noOfColumns) {
        
        if (noOfRows < 0 || noOfColumns < 0) {
            return null;
        }
        
        //if items is null OR its length is < 1
       // RETURN null
       
       Map map = new Map();
       map.getRows();
       map.getColumns();
       
       
        Location[][] locations = createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);
        RegularSceneType[] scenes = createScenes();
        
        assignItemsToScenes(scenes);
        assignScenesToLocations(scenes, map);

        return map;
    }
    
    private static Location[][] createLocations(int rows, int columns) {
       /*System.out.println("*** createLocations() called ***\n");
       return null;*/
       
     
     
        if (rows < 1 || columns < 1) {
        return null;
    }
       Location[][] locations = new Location[rows][columns];
     
     for (int i = 0; i < locations.length; i++) {
          for (int j = 0; j < locations[i].length; j++) {
           Location location = new Location(i,j);
           locations[i][j] = location;
         
          }

      }
     return locations;
    }
    
    private static RegularSceneType[] createScenes() {
        System.out.println("*** createScenes() called ***\n");
        //return null;
        
        RegularSceneType[] scenes = new RegularSceneType[11];
        
        //scenes[0] = new RegularSceneType();
        //scenes[1] = new QuestionSceneType();
        //scenes[2] = new RoomScene();

        
        RegularSceneType start = new RegularSceneType("This is the starting point", 0, 0, " S ");
        QuestionSceneType door = new QuestionSceneType(Question.OpenDoor, "You've arrived at a door!  Congrats!", 23, 0, "[D]");
        QuestionSceneType room = new QuestionSceneType(Question.GrabItem, "You've entered the room and see an item.", 35, 0, ":R:");
        
        RegularSceneType instructions = new RegularSceneType();
        RegularSceneType finish = new RegularSceneType("Congratualtions! You have escaped and won the game", 0, 0, " F ");
        RegularSceneType blank = new RegularSceneType("This is the hallway",0,0, "|H|");
        RegularSceneType wall = new RegularSceneType("This a wall",0,0,"|W|");

        
        scenes[SceneType.start.ordinal()] = start;
        scenes[SceneType.door.ordinal()] = door;
        scenes[SceneType.roomOne.ordinal()] = room;
        scenes[SceneType.roomTwo.ordinal()] = room;
        scenes[SceneType.roomThree.ordinal()] = room;
        scenes[SceneType.roomFour.ordinal()] = room;
        scenes[SceneType.instructions.ordinal()] = instructions;
        scenes[SceneType.finish.ordinal()] = finish;
        scenes[SceneType.blank.ordinal()] = blank;
        scenes[SceneType.wall.ordinal()] = wall;
        
        return scenes;
      
    }

   private static void assignItemsToScenes(RegularSceneType[] scenes) {
        
        RoomScene roomScene1 = new RoomScene();
        ArrayList<Inventory> resources = new ArrayList<>();
        resources.add(Inventory.Sand);
        resources.add(Inventory.TwoLiterBottle);
        
        RoomScene roomScene2 = new RoomScene();
        ArrayList<Inventory> resources2 = new ArrayList<>();
        resources2.add(Inventory.BlueKey);
        resources2.add(Inventory.Hammer);
        
        RoomScene roomScene3 = new RoomScene();
        ArrayList<Inventory> resources3 = new ArrayList<>();
        resources3.add(Inventory.RedKey);
        resources3.add(Inventory.DriftPin);
        resources3.add(Inventory.LockPick);
        
        RoomScene roomScene4 = new RoomScene();
        ArrayList<Inventory> resources4 = new ArrayList<>();
        resources4.add(Inventory.GreenKey);
       
        scenes[SceneType.roomOne.ordinal()] = roomScene1;
        scenes[SceneType.roomTwo.ordinal()] = roomScene2;
        scenes[SceneType.roomThree.ordinal()] = roomScene3;
        scenes[SceneType.roomFour.ordinal()] = roomScene4;
        

    }
    private static void assignScenesToLocations(RegularSceneType[] scenes, Map map) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.blank.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.blank.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.door.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.room.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.room.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.room.ordinal()]);
        locations[0][10].setScene(scenes[SceneType.room.ordinal()]);
        locations[0][11].setScene(scenes[SceneType.wall.ordinal()]);
        
        locations[1][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.room.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.room.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.room.ordinal()]);
        locations[1][10].setScene(scenes[SceneType.room.ordinal()]);
        locations[1][11].setScene(scenes[SceneType.wall.ordinal()]);
        
        locations[2][0].setScene(scenes[SceneType.room.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.room.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.room.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.room.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.room.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.room.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.room.ordinal()]);
        locations[2][10].setScene(scenes[SceneType.room.ordinal()]);
        locations[2][11].setScene(scenes[SceneType.wall.ordinal()]);
        
        locations[3][0].setScene(scenes[SceneType.room.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.room.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.room.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.room.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.room.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.room.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.room.ordinal()]);
        locations[3][10].setScene(scenes[SceneType.room.ordinal()]);
        locations[3][11].setScene(scenes[SceneType.wall.ordinal()]);
        
        locations[4][0].setScene(scenes[SceneType.room.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.room.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.room.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.room.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.room.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.room.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.room.ordinal()]);
        locations[4][10].setScene(scenes[SceneType.room.ordinal()]);
        locations[4][11].setScene(scenes[SceneType.wall.ordinal()]);
        
        locations[5][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.room.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.room.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.room.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.room.ordinal()]);
        locations[5][10].setScene(scenes[SceneType.room.ordinal()]);
        locations[5][11].setScene(scenes[SceneType.wall.ordinal()]);
        
        locations[6][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.door.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.door.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][10].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][11].setScene(scenes[SceneType.wall.ordinal()]);
            
        locations[7][0].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][10].setScene(scenes[SceneType.door.ordinal()]);
        locations[7][11].setScene(scenes[SceneType.finish.ordinal()]);
        
        locations[8][0].setScene(scenes[SceneType.door.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][10].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][11].setScene(scenes[SceneType.wall.ordinal()]);
        
        locations[9][0].setScene(scenes[SceneType.room.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.room.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.room.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[9][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.blank.ordinal()]);
        locations[9][10].setScene(scenes[SceneType.blank.ordinal()]);
        locations[9][11].setScene(scenes[SceneType.wall.ordinal()]);
        
        locations[10][0].setScene(scenes[SceneType.room.ordinal()]);
        locations[10][1].setScene(scenes[SceneType.room.ordinal()]);
        locations[10][2].setScene(scenes[SceneType.room.ordinal()]);
        locations[10][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[10][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[10][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[10][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[10][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[10][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[10][9].setScene(scenes[SceneType.blank.ordinal()]);
        locations[10][10].setScene(scenes[SceneType.blank.ordinal()]);
        locations[10][11].setScene(scenes[SceneType.wall.ordinal()]);
        
        locations[11][0].setScene(scenes[SceneType.room.ordinal()]);
        locations[11][1].setScene(scenes[SceneType.room.ordinal()]);
        locations[11][2].setScene(scenes[SceneType.room.ordinal()]);
        locations[11][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[11][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[11][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[11][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[11][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[11][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[11][9].setScene(scenes[SceneType.blank.ordinal()]);
        locations[11][10].setScene(scenes[SceneType.blank.ordinal()]);
        locations[11][11].setScene(scenes[SceneType.wall.ordinal()]);
    }
    
    public static Location movePlayer(Actor actor,int newRow, int newColumn) throws MapControlException{
       if (actor == null) {
           throw new MapControlException("Actor must have name");
       }
        
       Game game = SweetEscape.getCurrentGame();
       Map map = game.getMap();
       Location[][] locations = map.getLocations();
       
       
       if (newRow < 1 || newRow > map.getRows() ||
               newColumn < 1 || newColumn > map.getColumns()) {
           throw new MapControlException("Row or column cannot be less then one and must be on the map");
       }
       
        double currentRow = actor.getCoordinates().getX();
        double currentColumn = actor.getCoordinates().getY();
        

      Point startingLocation = actor.getCoordinates();
      Point endingLocation = new Point(newRow, newColumn);
      if (MapControl.validMove(startingLocation, endingLocation) == null) {
          throw new MapControlException("Your path was blocked by a wall");
      }
      
      
      
      Location newLocation = locations[endingLocation.x][endingLocation.y];
      Location oldLocation = locations[startingLocation.x][startingLocation.y];
      
      actor.setCoordinates(startingLocation);
      oldLocation = null;
      actor.setCoordinates(endingLocation);
      
      oldLocation.setActor(null);
      newLocation.setActor(actor);
      
 
      
     //newRow = actor.setCoordinates(oldLocation);
     newRow = (int) actor.getCoordinates().getX();
     newColumn = (int) actor.getCoordinates().getY();
     //newColumn = actor.setCoordinates(oldLocation);
     
     return newLocation;
    }
    
    public static Point validMove(Point startingLocation, Point endingLocation) {
        //For loop to check the ending loction to make sure it is not a wall
        for()
    }
    
}
