/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.InventoryControl;
import byui.cit260.sweetEscape.exceptions.InventoryControlException;
import byui.cit260.sweetEscape.model.Item;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sweetescape.SweetEscape;

/**
 *
 * @author chadh
 */
class ToolMenuView  extends View{

    public ToolMenuView() {
    }
    

    @Override
    public String[] getInputs() {
      String[] inputs = new String[1];
       
      
           String menuItem = this.getInput(
                              "-----------------------\n" +
                              "       Tool Menu       |\n" +
                              "-----------------------\n" +"H - Hammer\n" +
                              "P - Drift pin\n" +
                              "L - Lock pick\n" +
                              "T - Two Liter Bottle\n" +
                              "S - Sand\n" +
                              "F - Find total of all Items\n" +
                              "Q - Quit ");
           
          
        inputs[0] = menuItem;
        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
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
           case "F" : findTotal();
           break;
           case "Q" : return true;
           default : System.out.println("Invalid menu item"); 
           

        }
       return false;
    }

    private void hammer() {
        this.console.println("Hammer");
    }

    private void driftPin() {
       this.console.println("Drift Pin");
    }

    private void lockPick() {
        this.console.println("Lock Pick");
    }

    private void twoLiterBottle() {
        this.console.println("Two-Liter Bottle");
    }

    private void sand() {
       this.console.println("It's just some sand!");
    }
   
    private void findTotal() {
        InventoryControl ic = new InventoryControl();
        SweetEscape se = new SweetEscape();
        
        System.out.println("The total is " + ic.findTotal(se.getCurrentGame().getInventory()));

    }

}
