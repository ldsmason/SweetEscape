/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;

/**
 *
 * @author nathanielmason
 */
public class inventoryControl {
    
public static double calcLiters(double lbs, double guess){
    if (lbs < 1 || lbs > 50) {
        return -1;
    }
    
    double liters = lbs/2.2;
    
    double fillBottle = liters/2;
    
    
    
    guess = fillBottle;
    
 
    double corGuess = fillBottle;
    
    if (guess != corGuess){
        return -2;
    }
    
    return 0;
    
  
    
}
   
}
