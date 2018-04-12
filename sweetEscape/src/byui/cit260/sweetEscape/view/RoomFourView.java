/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

/**
 *
 * @author chadh
 */
public class RoomFourView extends View {

    public RoomFourView() {
    
    }
    
    String[] inputs = new String[4];
    
    @Override
    public String[] getInputs() {
        
        String value = this.getInput(
                  "You enter the room and begin to search around.  After looking\n"
                + "inside a vase or two, you find a beautifully-crafted key of\n"
                + "emerald inside a vent on the wall"
                + "Would you like to add this item to your inventory?\n\n"
                + "Yes(Y) or No(N) \n\n");
        
        inputs[0] = value;
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();
        
        switch (menuItem) {
            case "Y":
                System.out.println("You add GREEN KEY to your inventory and exit the room.");
                break;
            case "N":
                System.out.println("You leave the GREEN KEY and exit the room.");
                break;
            default:
                System.out.println("Type 'Y' or 'N'");
                break;
        }
        return true;
    }
    
    
}
