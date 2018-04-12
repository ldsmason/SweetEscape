/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.view;

import byui.cit260.sweetEscape.model.Inventory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import sweetescape.SweetEscape;


/**
 *
 * @author chadh
 */
public class InventoryReportView extends View{

    public InventoryReportView() {
    }
    
    private static Inventory report = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    @Override
    public String[] getInputs() {
       String[] inputs = new String[2];
       String value = this.getInput("Where would you like to save the report to?\n\n"
               + "Enter the file path here:\n\n");
       inputs[0] = value;
       return inputs;  
    }

    @Override
    public boolean doAction(String[] inputs) {
        InventoryReportView.inFile = new BufferedReader(new InputStreamReader(System.in));
        InventoryReportView.outFile = new PrintWriter(System.out,true);
        return true;
    }
    
    
}
