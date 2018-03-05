/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import java.util.Scanner;

/**
 *
 * @author chadh
 */
class ToolMenuView {
    void displayToolMenuView() {
         boolean endView = false;
        do {
                String[] inputs = this.getInputs();
                String value = inputs[0].toUpperCase();
                
                if (inputs.length < 1 || value.equals("Q")){
                   return; 
                }
                endView = doAction(inputs);
                
          
                }
        while (endView != true);
    }

    private String[] getInputs() {
      String[] inputs = new String[1];
       
       boolean valid = false;
       while (valid == false) {
           System.out.println("H - Hammer\n" +
                              "P - Drift pin\n" +
                              "L - Lock pick\n" +
                              "T - Two Liter Bottle\n" +
                              "S - Sand\n" +
                              "Q - Quit ");
           
           Scanner nameInput;
           nameInput = new Scanner(System.in);
           
           String name = nameInput.nextLine();
           
           String nameWithTrim = name.trim();
           
           if (inputs.length < 1) {
               System.out.println("You must enter a non-blank value");
               continue;
           }
           
           else {
               inputs[0] = nameWithTrim;
           valid = true;
           }
       }
      return inputs;

    }

    private boolean doAction(String[] inputs) {
      String menuItem = inputs[0];
       menuItem = inputs[0].toUpperCase();
       
       switch (menuItem) {
           case "H" : hammer();
           break;
           case "P" : driftPin();
           break;
           case "L" : lockPick();
           break;
           case "T" : twoLiterBottle();
           break;
           case "S" : sand();
           break;
           case "Q" : return true;
           default : System.out.println("Invalid menu item"); 
           

    }
       return false;
    }

    private void hammer() {
        System.out.println("Hammer");
    }

    private void driftPin() {
        System.out.println("Drift Pin");
    }

    private void lockPick() {
        System.out.println("Lock Pick");
    }

    private void twoLiterBottle() {
        System.out.println("Two-Liter Bottle");
    }

    private void sand() {
        System.out.println("It's just some sand!");
    }

}
