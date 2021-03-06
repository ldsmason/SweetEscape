/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.DoorControl;
import byui.cit260.sweetEscape.exceptions.DoorControlException;
import byui.cit260.sweetEscape.model.DoorScene;
import byui.cit260.sweetEscape.model.Location;
import byui.cit260.sweetEscape.model.RegularSceneType;
import java.awt.Point;
import java.util.Random;
import sweetescape.SweetEscape;

/**
 *
 * @author nathanielmason
 */
class OpenDoorView extends View {

    int num = 0;

    public OpenDoorView() {

    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        boolean valid = false;
        int max = 135;
        Random rand = new Random();
        //double num = rand.nextDouble();
        this.num = rand.nextInt(max + 1);
        
        

        this.getInput("You see written all over the wall the number " + num
                + "\nYou also see the equation answer = num/2 + 32, code = answer*answer\n");

        Point coordinates = SweetEscape.getPlayer().getActor().getCoordinates();
        Location location = SweetEscape.getCurrentGame().getMap().getLocations()[coordinates.x][coordinates.y];
        RegularSceneType scene = location.getScene();
        if(scene instanceof DoorScene) {
             DoorScene doorScene = (DoorScene) scene;
             this.console.println(doorScene.getKeyPad());
        }
       
        String value = this.getInput("Enter the four digit code");
        inputs[0] = value;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        int guess = 0;
        try {
            guess = Integer.parseInt(inputs[0]);
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(), "Please enter a number. You cannot enter text");
        }

        if (guess > 9999) {
            ErrorView.display(this.getClass().getName(),"Try again the number was too high or decimal point was included.");
            this.console.println("=================================================");
            return false;
        }
        long code = -1;
        try {
            code = DoorControl.calcKeypad(this.num);
        } catch (DoorControlException dce) {
            System.out.println(dce.getMessage());
        }

        if (code != guess) {
            ErrorView.display(this.getClass().getName(),"try again"
                    + "\n=================================================");
            return false;
        }

        this.console.println(
                "=========================================="
                + "\nYou just opened the door!"
                + "\n==========================================");

        return true;
    }
}
