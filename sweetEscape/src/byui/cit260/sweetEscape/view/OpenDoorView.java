/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.DoorControl;
import byui.cit260.sweetEscape.control.GameControl;
import byui.cit260.sweetEscape.model.Door;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nathanielmason
 */
class OpenDoorView {

    int num = 0;

    public void displayOpenDoorView() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();

            if (inputs[0].equals("Q")) {
                return;
            }
            endView = doAction(inputs);

        } while (endView != true);

    }

    private String[] getInputs() {
        String[] inputs = new String[1];

        boolean valid = false;
        int max = 135;
        Random rand = new Random();
        //double num = rand.nextDouble();
        this.num = rand.nextInt(max + 1);

        System.out.println("You see written all over the wall the number " + num
                         + "\nYou also see the equation answer = num/2 + 32, code = answer*answer");

        Scanner input;
        input = new Scanner(System.in);
        
        Door currentDoor = GameControl.getCurrentDoor();
        while (valid == false) {
            System.out.println(currentDoor.getDescription());

            String answer = input.nextLine();
            answer = answer.trim();
            if (answer.length() < 1) {
                System.out.println("You must enter a value.");
                continue;
            }
            inputs[0] = answer;
            System.out.println("=================================================");
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {

        int guess = Integer.parseInt(inputs[0]);
        

        if (guess > 9999) {
            System.out.println("try again the number was too high or decimal point was included.");
            System.out.println("=================================================");
            return false;
        }
        long code = DoorControl.calcKeypad(this.num);

        if (code != guess) {
            System.out.println("try again" +
            "\n=================================================");
            return false;
        }

        System.out.println(
                "=========================================="
                + "\nYou just opened the door!"
                + "\n==========================================");
        
        return true;
    }
}

