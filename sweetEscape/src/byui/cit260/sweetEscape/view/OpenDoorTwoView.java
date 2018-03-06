/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;
import byui.cit260.sweetEscape.control.inventoryControl;
import java.util.Scanner;

/**
 *
 * @author chadh
 */
public class OpenDoorTwoView { 
    public void displayOpenDoorTwoView(){
        boolean endView = false;
        do {
                String[] inputs = this.getInputs();
                String value = inputs[0].toUpperCase();
                
                if (inputs.length < 1 || value.equals("Q")){
                   return; 
                }
                endView = doAction(inputs);
                
                }
        while (endView != true);
    }
    
    private String[] getInputs() {
        String[] inputs = new String[1];
        
        boolean valid = false;
        while (valid == false) {
            System.out.println("Enter");
        
            Scanner nameInput;
            nameInput = new Scanner(System.in);
            
            String name = nameInput.nextLine();
            
            String nameWithTrim = name.trim();
        }
 
  
        Scanner fillBottle = new Scanner(System.in);
        System.out.println("Please enter bottle size.");
        Scanner inFile;
        inFile= new Scanner(System.in);
       
        while (valid==false) {
           System.out.println("Please enter the number of times needed to fill"
                             + "\n bottle with sand.");
           Scanner nameInput;
           nameInput = new Scanner(System.in);
           
           String name = nameInput.nextLine();
           
           String nameWithTrim = name.trim();
           
           if (inputs.length < 1) {
               System.out.println("You must enter a value");
               continue;   
            }
           
           else {
               inputs[0] = nameWithTrim;
               valid = true;
           }  
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
       String menuItem = inputs[0];
       menuItem = inputs[0].toUpperCase();
       
       switch (menuItem) {
           case "Enter" : calcLiters();
           break;
           case "Q" : return true;
           default : System.out.println("Invalid menu item");
       }
       return false;
    }
    
    private void calcLiters() {
        System.out.println("Great Job!");
    }

    
    
}
