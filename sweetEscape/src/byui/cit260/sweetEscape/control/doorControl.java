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
public class doorControl {
    
   public static long calcKeypad (double num, double answer) {
     
     if (num < 0)
         return -1;
     
     if (num > 135)
         return -2;
     
     answer = num/2 + 32;
     
     long code = (long)(answer * answer);
     
     return code;
     
 }

}
