/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

/**
 *
 * @author nathanielmason
 */
class GameMenuView {

    public GameMenuView() {
    }
    
    public void displayGameMenuView() {
        boolean endView = false;
        do {
                String[] inputs = this.getInputs();
                String value = inputs[0].toUpperCase();
                
                if (inputs.length < 1 || value.equals('Q')){
                   return; 
                }
                endView = doAction(inputs);
                
          
                }
        while (endView != true);
        
    }

    private String[] getInputs() {
        System.out.println("**** GameMenuView - getInputs() called ***");
       
       String[] inputs = new String[1];
       inputs[0] = "gameMenuSelected";
       
       return inputs;

    }

    private boolean doAction(String[] inputs) {
       System.out.println("**** GameMenuView - doAction() called ***");
       System.out.println("\tinputs = " + inputs[0]);
       
       return true;

    }

}
