/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;

import byui.cit260.sweetEscape.exceptions.DoorControlException;


/**
 *
 * @author nathanielmason
 */
public class DoorControl  {
   
    
   public static long calcKeypad (double num) throws DoorControlException {
     double answer;
     //System.out.println("Please enter a number");
     
      
     if (num < 0) {
         throw new DoorControlException("The number cannot be negative");
         
     }
     
     if (num > 135) {
        throw new DoorControlException("The number cannot be greater than 135");
     }
     
   
     
     answer = num/2 + 32;
     
     long code = (long)(answer * answer);
     
     return code;
     
 }

}
 