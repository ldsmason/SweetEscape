/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author chadh
 */
public class StartProgramView implements Serializable{

    public StartProgramView() {
        
    }
    private ArrayList<StartProgramView> inputs = new ArrayList<StartProgramView>();
    public void displayPublicStartView(){
        boolean endView = false;
        do {
                String[] inputs = this.getInputs();
                
                if (inputs.length < 1 || inputs.equals('Q')){
                   return; 
                }
                endView = doAction(inputs);
                doAction(inputs);
          
                }
        while (endView != true);
        
    }

    private String[] getInputs() {
       System.out.println("**** getInputs() called ***");
       
       String[] inputs = new String[1];
       inputs[0] = "testInput";
       
       return inputs;
    }

    private boolean doAction(String[] inputs) {
       System.out.println("**** doAction() called ***");
       System.out.println("\tinputs = " + inputs[0]);
       
       return true;
    }
    
}
