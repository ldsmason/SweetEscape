/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweetescape;
import byui.cit260.sweetEscape.model.Player;


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
       
       playerOne.setName("Stephen McMansley");
       playerOne.setBestTime(7.00);
       
       String playerOneName = playerOne.getName();
       double playerOneTime = playerOne.getBestTime();
       
       System.out.println("Name = " + playerOneName +
                           ", time = " + playerOneTime);
       
    }
    
}
