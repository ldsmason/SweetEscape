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
public class RoomThreeView extends View {

    public RoomThreeView() {
    
    }
    
    String[] inputs = new String[4];
    
    @Override
    public String[] getInputs() {
        
        String value = this.getInput(
                  "You enter the room and as you look around, tearing apart couch\n"
                + "cushions and looking behind books, you find a DRIFT PIN and a\n"
                + "mysterious RED KEY\n\n"
                + "Would you like to add these items to your inventory?\n\n"
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
                System.out.println("You have added DRIFT PIN and RED KEY to your inventory and exit the room.");
                break;
            case "N":
                System.out.println("You leave the DRIFT PIN and RED KEY and exit the room.");
                break;
            default:
                System.out.println("Type 'Y' or 'N'");
                break;
        }
        return true;
    }
    
    
}
