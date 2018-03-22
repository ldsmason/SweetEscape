/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;
import byui.cit260.sweetEscape.model.Inventory;
import byui.cit260.sweetEscape.model.Location;
import byui.cit260.sweetEscape.model.Map;
import byui.cit260.sweetEscape.model.Question;
import byui.cit260.sweetEscape.model.QuestionSceneType;
import byui.cit260.sweetEscape.model.RegularSceneType;
import byui.cit260.sweetEscape.model.RoomScene;
import byui.cit260.sweetEscape.model.SceneType;
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
       map.getRow();
       map.getColumn();
       
       
        Location[][] locations = createLocations(noOfRows, noOfColumns);
        RegularSceneType[] scenes = createScenes();
       
        
        
        
        assignItemsToScenes(/*items,*/ scenes);
        assignScenesToLocations(map, scenes);
        
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
        
        RegularSceneType[] scenes = new RegularSceneType[9];
        
        scenes[0] = new RegularSceneType();
        scenes[1] = new QuestionSceneType();
        scenes[2] = new RoomScene();

        
        RegularSceneType start = new RegularSceneType("This is the starting point", 0, 0, " S ");
        QuestionSceneType door = new QuestionSceneType(Question.OpenDoor, "You've arrived at a door!  Congrats!", 23, 0, "[D]");
        QuestionSceneType room = new QuestionSceneType(Question.GrabItem, "You've entered the room and see an item.", 35, 0, ":R:");
        
        RegularSceneType instructions = new RegularSceneType();
        RegularSceneType finish = new RegularSceneType("Congratualtions! You have escaped and won the game", 0, 0, " F ");
        RegularSceneType blank = new RegularSceneType("This is the hallway",0,0, "|H|");
        RegularSceneType wall = new RegularSceneType("This a wall",0,0,"|W|");

        
        scenes[SceneType.start.ordinal()] = start;
        scenes[SceneType.door.ordinal()] = door;
        scenes[SceneType.room.ordinal()] = room;
        scenes[SceneType.instructions.ordinal()] = instructions;
        scenes[SceneType.finish.ordinal()] = finish;
        scenes[SceneType.blank.ordinal()] = blank;
        scenes[SceneType.wall.ordinal()] = wall;
        
        return scenes;
      
    }

    private static void assignItemsToScenes(/*Inventory[] items,*/ RegularSceneType[] scenes) {
        
    }
    private static void assignScenesToLocations(Map map, RegularSceneType[] scenes){
       System.out.println("*** assignItemsToScenes() called ***\n");
       // Location[][] locations = map.getLocation();
        
        /*locations[0][0].setRegularSceneType[scenes[SceneType.start.ordinal()]];
        locations[0][1].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[0][2].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[0][3].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[0][4].setRegularSceneType[scenes[SceneType.door.ordinal()]];
        locations[0][5].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[0][6].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[0][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[0][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[0][9].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[0][10].setRegularSceneType[scenes[SceneType.blank.ordinal()]]
        locations[0][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        
        locations[1][0].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[1][1].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[1][2].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[1][3].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[1][4].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[1][5].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[1][6].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[1][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[1][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[1][9].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[1][10].setRegularSceneType[scenes[SceneType.blank.ordinal()]]
        locations[1][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        
        locations[2][0].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[2][1].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[2][2].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[2][3].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[2][4].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[2][5].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[2][6].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[2][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[2][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[2][9].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[2][10].setRegularSceneType[scenes[SceneType.blank.ordinal()]]
        locations[2][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        
        locations[3][0].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[3][1].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[3][2].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[3][3].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[3][4].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[3][5].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[3][6].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[3][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[3][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[3][9].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[3][10].setRegularSceneType[scenes[SceneType.blank.ordinal()]]
        locations[3][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        
        locations[4][0].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[4][1].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[4][2].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[4][3].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[4][4].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[4][5].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[4][6].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[4][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[4][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[4][9].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[4][10].setRegularSceneType[scenes[SceneType.blank.ordinal()]]
        locations[4][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        
        locations[5][0].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[5][1].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[5][2].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[5][3].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[5][4].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[5][5].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[5][6].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[5][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[5][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[5][9].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[5][10].setRegularSceneType[scenes[SceneType.blank.ordinal()]]
        locations[5][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        
        locations[6][0].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[6][1].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[6][2].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[6][3].setRegularSceneType[scenes[SceneType.door.ordinal()]];
        locations[6][4].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[6][5].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[6][6].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[6][7].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[6][7].setRegularSceneType[scenes[SceneType.door.ordinal()]];
        locations[6][9].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[6][10].setRegularSceneType[scenes[SceneType.wall.ordinal()]]
        locations[6][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
            
        locations[7][0].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[7][1].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[7][2].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[7][3].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[7][4].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[7][5].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[7][6].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[7][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[7][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[7][9].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[7][10].setRegularSceneType[scenes[SceneType.blank.ordinal()]]
        locations[7][11].setRegularSceneType[scenes[SceneType.door.ordinal()]];
        
        locations[8][0].setRegularSceneType[scenes[SceneType.door.ordinal()]];
        locations[8][1].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[8][2].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[8][3].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[8][4].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[8][5].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[8][6].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[8][7].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[8][7].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[8][9].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[8][10].setRegularSceneType[scenes[SceneType.wall.ordinal()]]
        locations[8][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        
        locations[9][0].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[9][1].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[9][2].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[9][3].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[9][4].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[9][5].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[9][6].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[9][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[9][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[9][9].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[9][10].setRegularSceneType[scenes[SceneType.blank.ordinal()]]
        locations[9][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        
        locations[10][0].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[10][1].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[10][2].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[10][3].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[10][4].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[10][5].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[10][6].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[10][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[10][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[10][9].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[10][10].setRegularSceneType[scenes[SceneType.blank.ordinal()]]
        locations[10][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        
        locations[11][0].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[11][1].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[11][2].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[11][3].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[11][4].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[11][5].setRegularSceneType[scenes[SceneType.wall.ordinal()]];
        locations[11][6].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[11][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[11][7].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[11][9].setRegularSceneType[scenes[SceneType.blank.ordinal()]];
        locations[11][10].setRegularSceneType[scenes[SceneType.blank.ordinal()]]
        locations[11][11].setRegularSceneType[scenes[SceneType.wall.ordinal()]];*/
    }
    
}
