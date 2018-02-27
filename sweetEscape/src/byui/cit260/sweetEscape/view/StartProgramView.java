/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;
import java.io.Serializable;
//import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chadh
 */
public class StartProgramView implements Serializable{

    public StartProgramView() {
        
    }
    
    //private ArrayList<StartProgramView> inputs = new ArrayList<StartProgramView>();
    
    public void displayPublicStartView(){
        boolean endView = false;
        do {
                String[] inputs = this.getInputs();
                String value = inputs[0].toUpperCase();
                
                if (inputs.length < 1 || inputs.equals('Q')){
                   return; 
                }
                endView = doAction(inputs);
                
          
                }
        while (endView != true);
        
    }

    private String[] getInputs() {
       String[] inputs = new String[1];
       
        //Display the welcome banner
       
       boolean valid = false;
       
       while (valid == false){
           //Display the prompt message
           System.out.println("Enter player's name");
           
           Scanner nameInput;
           nameInput = new Scanner(System.in);
           
           String name = nameInput.nextLine();
           
           String nameWithTrim = name.trim();
           
           if (inputs.length < 1){
               System.out.println("You must enter a value");
           }
           
           else {
                inputs[0] = nameWithTrim;
                valid = true;
           }
       }
       
       
       return inputs;
    }

    private boolean doAction(String[] inputs) {
       
       
       return true;
    }
    
}
