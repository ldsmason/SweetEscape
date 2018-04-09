/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import java.io.PrintWriter;
import sweetescape.SweetEscape;

/**
 *
 * @author nathanielmason
 */
public class ErrorView {
    private static PrintWriter console = SweetEscape.getOutput();
     private static PrintWriter log = SweetEscape.getLogFile();
     
     private static void display(String className, String errorMessage) {
         console.println(
         "\n ----- ERROR -----------------------------------------------------"
       + "\n" + errorMessage +
         "\n -----------------------------------------------------------------");
         
         log.printf("%n%n%s", className + " - " + errorMessage);
     }
}
