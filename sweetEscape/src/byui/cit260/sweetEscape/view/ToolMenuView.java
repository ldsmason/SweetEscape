/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.control.InventoryControl;
import java.util.Scanner;
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
       
      
           String menuItem = this.getInput("H - Hammer\n" +
                              "P - Drift pin\n" +
                              "L - Lock pick\n" +
                              "T - Two Liter Bottle\n" +
                              "S - Sand\n" +
                              "F - Find total of all Items\n" +
                              "Q - Quit ");
           
          
        
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
    
    private void findTotal() {
        InventoryControl ic = new InventoryControl();
        SweetEscape se = new SweetEscape();
        System.out.println("The total is " + ic.findTotal( se.getCurrentGame().getInventory()));
    }

}
