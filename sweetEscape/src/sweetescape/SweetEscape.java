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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    private static BufferedReader input = null;
    private static PrintWriter output = null;
    
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
       
      try {
      input = new BufferedReader(new InputStreamReader(System.in));
      output = new PrintWriter(System.out, true);
      logFile = new PrintWriter("logFile.txt");
      SweetEscape.inFile = new BufferedReader(new InputStreamReader(System.in));
      SweetEscape.outFile = new PrintWriter(System.out, true);
          
      StartProgramView startProgramView = new StartProgramView();
      startProgramView.display();
      }
      catch (Throwable e) {
          //System.out.println("An error has occured");
          System.out.println("Exception " + e.toString() +
                             "\nCause "   + e.getCause() +
                             "\nMessage " + e.getMessage());
          
          e.getStackTrace();;
      }
      finally {
          try {
               if(SweetEscape.inFile != null)
               SweetEscape.inFile.close();
               if(SweetEscape.outFile != null)
               SweetEscape.outFile.close();
               
                if(input != null) {
                   input.close();
               }
               
               if(output != null) {
                   output.close();
               }
                   
          } catch (IOException ex) {
              System.out.println("Errpr closing the file");
              return;
          }
             
              
          
          
      }
       
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SweetEscape.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SweetEscape.inFile = inFile;
    }

    public static BufferedReader getInput() {
        return input;
    }

    public static void setInput(BufferedReader input) {
        SweetEscape.input = input;
    }

    public static PrintWriter getOutput() {
        return output;
    }

    public static void setOutput(PrintWriter output) {
        SweetEscape.output = output;
    }
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SweetEscape.logFile = logFile;
    }
    
    
    
    
}
