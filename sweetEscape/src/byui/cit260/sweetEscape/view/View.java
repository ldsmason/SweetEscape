/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import sweetescape.SweetEscape;

/**
 *
 * @author nathanielmason
 */
public abstract class View implements ViewInterface {

    protected final BufferedReader keyboard = SweetEscape.getInFile();
    protected final PrintWriter console = SweetEscape.getOutFile();
    public View() {
    }

    @Override
    public void display() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            String value = inputs[0].toUpperCase();

            if (value.equals("Q")) {
                return;
            }
            endView = doAction(inputs);

        } while (endView != true);
    }

    @Override
    public String getInput(String promptMessage) {
        String[] inputs = new String[1];

        boolean valid = false;
        
        while (valid == false) {
            //Display the prompt message
            this.console.println(promptMessage);

            Scanner nameInput;
            nameInput = new Scanner(System.in);

            String name = nameInput.nextLine();

            String nameWithTrim = name.trim();

            if (nameWithTrim.length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            } else {
                return nameWithTrim;

            }
            
        }
        return null;
    }
}
