/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.model.Door;

/**
 *
 * @author chadh
 */
public class OpenDoorOneView extends View {

    public OpenDoorOneView() {
    }
    
    
    public String[] getInputs() {
    String[] inputs = new String[0];
    String menuItem = this.getInput("========================================\n"
            + "You see a door at the end of the hall,\n"
            + "would you like to open it?\n"
            + "Yes (Y) or No (N) ?\n"
            + "========================================");
    
            inputs[0] = menuItem;
            return inputs;
    }
    
    public boolean doAction(String[]inputs) {
        String menuItem=inputs[0];
        menuItem = inputs[0].toUpperCase();
        
        switch (menuItem) {
            case "Y" : openDoorOne();
            break;
            case "N" : System.out.println("You do not open the door.");
            break;
        }
        return false;
    }

    private void openDoorOne() {
        Door doors = new Door();
        OpenDoorOneView openDoorOneView = new OpenDoorOneView();
        openDoorOneView.display();
        System.out.println("***openDoorOne called***");
        
    }
}
