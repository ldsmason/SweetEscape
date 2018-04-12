/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.model.Inventory;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author nathanielmason
 */
public class PrintReportView extends View {

    @Override
    public String[] getInputs() {
       String[] inputs = new String[1];
       String mainInput = this.getInput("Type the path where you would like to save the game\n"
                                          + "Example C:/Users/tmp/save.dat"
                                          + "\n or Q - to go back"
                                          + "Enter the with the file name to save your current game ");
       
       inputs[0] = mainInput;
       return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
       ArrayList<Inventory> allItems = new ArrayList();
       allItems.add(Inventory.BlueKey);
       allItems.add(Inventory.DriftPin);
       allItems.add(Inventory.GreenKey);
       allItems.add(Inventory.Hammer);
       allItems.add(Inventory.LockPick);
       allItems.add(Inventory.RedKey);
       allItems.add(Inventory.Sand);
       allItems.add(Inventory.TwoLiterBottle);
       
       String filePath = inputs[0];
       if (filePath == null) {
           ErrorView.display(this.getClass().getName(), "file path cannot be empty");
       }
       try (PrintWriter out = new PrintWriter(filePath)) {
           out.println("\n\n             Current Inventory              ");
           out.printf("%n%ls%20s", "Item", "Description");
           out.printf("%n%ls%20s", "----", "----------");
           out.println();
           for (Inventory inventory : allItems) {
               out.println(inventory.getItemName() + "    " + inventory.getItemDescription());
               out.println();
           }
           this.console.println("Report wa printed successfully and saved to: " + filePath);
       } catch (FileNotFoundException ex) {
           ErrorView.display(this.getClass().getName(), ex.getMessage());
       }
       
       return true;
    }
    
}
