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
public class InventoryControl implements Serializable{
    
public static double pickLock(double mass, double force, double guessAccel){
    
    double accel = force / mass;
    if (guessAccel == accel){
       
        return 0;
    
    }
    
    else {
        return -1;
    }
  
}

public static double checkMass(double guessMass2, double mass2) {
    
    if (guessMass2 == mass2){
        return 0;
    }
    
    else {
        return -1;
    } 
}

public static double kickDoor(double mass2, double accel2, double force2){
    
    if (accel2 < 2000 || accel2 > 5000){
       
        return -1;
    
    }
    
    if (accel2 > 2000 && accel2 < 5000){
       
        return 0;
   
      }
     
  return force2;
}
    
public static double calcLiters(double lbs, double guess){
    if (lbs < 1 || lbs > 50) {
        return -1;
    }
    
    double liters = lbs/2.2;
    
    double fillBottle = Math.round((liters/2)*100);
    
    fillBottle/= 100;
            
    
    if (guess != fillBottle){
        return -2;
    }
    
    return 0;
    
  
    
}
   
}