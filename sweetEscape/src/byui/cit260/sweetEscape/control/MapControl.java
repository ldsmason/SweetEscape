/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;
import byui.cit260.sweetEscape.model.Location;
import byui.cit260.sweetEscape.model.Map;
import byui.cit260.sweetEscape.model.Question;
import byui.cit260.sweetEscape.model.QuestionSceneType;
import byui.cit260.sweetEscape.model.RegularSceneType;
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
        Question[] questions = createQuestions();
        
        
        assignQuestionsToScenes(questions, scenes); 
        assignItemsToScenes(scenes);
        assignScenesToLocations(scenes, locations);
        
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

        
        RegularSceneType start = new RegularSceneType("This is the starting point", 0, 0, " s ");
        QuestionSceneType door = new QuestionSceneType(Question.OpenDoor, "You've arrived at a door!  Congrats!", 23, 0, "[D]");
        QuestionSceneType room = new QuestionSceneType(Question.GrabItem, "You've entered the room and see an item.", 35, 0, ":R:");
        RegularSceneType instructions = new RegularSceneType();
        RegularSceneType finish = new RegularSceneType("Congratualtions! You have escaped and won the game", 0, 0, " f ");
        RegularSceneType blank = new RegularSceneType();
        
        scenes[SceneType.start.ordinal()] = start;
        scenes[SceneType.door.ordinal()] = door;
        scenes[SceneType.room.ordinal()] = room;
        scenes[SceneType.instructions.ordinal()] = instructions;
        scenes[SceneType.finish.ordinal()] = finish;
        scenes[SceneType.blank.ordinal()] = blank;
        
        return scenes;
      
    }

    private static void assignItemsToScenes(RegularSceneType[] scenes) {
        System.out.println("*** assignItemsToScenes() called ***\n");
    }
    private static void assignScenesToLocations(RegularSceneType[] scenes, Location[][] locations){
        System.out.println("*** assignScenesToLocations() called ***\n");
    }
    
}
