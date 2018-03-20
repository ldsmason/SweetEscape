/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;
import byui.cit260.sweetEscape.model.*;
import javafx.scene.Scene;
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
        Scene[] scenes = createScenes();
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
     
         long total = 0;
     for (int i = 0; i < locations.length; i++) {
          for (int j = 0; j < locations[i].length; j++) {
              //locations[i][j];
          }

      }
     return locations;
    }
    
    private static Scene[] createScenes() {
        System.out.println("*** createScenes() called ***\n");
        //return null;
        
        Scene[] scenes = new Scene[9];
        
        Scene[] start = new Scene[0];
        Scene[] roomOne = new Scene[1]; 
        Scene[] roomTwo = new Scene[2];
        Scene[] roomThree = new Scene[3];
        Scene[] roomFour = new Scene[4];
        Scene[] hallway = new Scene[5];
        Scene[] question = new Scene[6];
        Scene[] instructions = new Scene[7];
        Scene[] finish = new Scene[8];
        
        return scenes;
      
    }
    
    private static Question[] createQuestions() {
        System.out.println("*** createQuestions() called ***\n");
        return null;
    }
    
    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
        System.out.println("*** assignQuestionsToScenes() called ***\n");
       
    }
    private static void assignItemsToScenes(Scene[] scenes) {
        System.out.println("*** assignItemsToScenes() called ***\n");
    }
    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations){
        System.out.println("*** assignScenesToLocations() called ***\n");
    }
    
}
