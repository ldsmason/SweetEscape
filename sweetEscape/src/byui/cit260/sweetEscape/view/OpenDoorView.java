/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.DoorControl;
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
        int num = rand.nextInt(max + 1);

        System.out.println("You see written all over the wall the number " + num);

        Scanner input;
        input = new Scanner(System.in);
        while (valid == false) {
            System.out.println("--------------\n"
                    + "| 1 | 2 | 3 |\n"
                    + "| 4 | 5 | 6 |\n"
                    + "| 7 | 8 | 9 |\n"
                    + "    | 0 |    \n"
                    + "-------------"
                    + "=================================================\n"
                    + "\nEnter a number");

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
            System.out.println("try again the number was too high");
            System.out.println("=================================================");
            return false;
        }
        long code = DoorControl.calcKeypad(this.num);

        if (code != this.num) {
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

