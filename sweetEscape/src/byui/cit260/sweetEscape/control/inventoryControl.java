/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;
import java.io.Serializable;

/**
 *
 * @author nathanielmason
 */
public class inventoryControl implements Serializable{
    
public static double kickDoor(double mass, double accel, double accel2){
    
    if (accel < 450 || accel > 650){
       
        return -1;
    
    }
    
    double force2 = mass * accel2;
    
    if (accel > 450 && accel < 650){
       
        if (accel2 < 2000 || accel2 >= 5000){
        
        return 0;
        
        }
        
      }
     
  return force2;
}
    
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
