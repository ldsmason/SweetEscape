/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sweetEscape.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nathanielmason
 */
public class inventoryControlTest {
    
    public inventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcLiters method, of class inventoryControl.
     */
    @Test
    public void testCalcLiters() {
        System.out.println("calcLiters");
        
        // Test Case 1
        System.out.println("\tTest Case 1");
        double lbs = 10.0;
        double guess = 2.272727;
        double expResult = 0.0;
        double result = inventoryControl.calcLiters(lbs, guess);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        // Test Case 2
        System.out.println("\tTest Case 2");
        lbs = -5.0;
        guess = 2.272727;
        expResult = -1.0;
        result = inventoryControl.calcLiters(lbs, guess);
        assertEquals(expResult, result, 0.0);
        
          // Test Case 3
        System.out.println("\tTest Case 3");
        lbs = 10.0;
        guess = 7.0;
        expResult = 0.0;
        result = inventoryControl.calcLiters(lbs, guess);
        assertEquals(expResult, result, 0.0);
        
        // Test Case 4
        System.out.println("\tTest Case 4");
        lbs = 1.0;
        guess = 0.0227273;
        expResult = 0.0;
        result = inventoryControl.calcLiters(lbs, guess);
        assertEquals(expResult, result, 0.0);
        
        // Test Case 5
        System.out.println("\tTest Case 5");
        lbs = 50.0;
        guess = 11.36364;
        expResult = 0.0;
        result = inventoryControl.calcLiters(lbs, guess);
        assertEquals(expResult, result, 0.0);
        
      
    }

    /**
     * Test of kickDoor method, of class inventoryControl.
     */
    @Test
    public void testKickDoor() {
        System.out.println("kickDoor");
        
        //Test Case 1
        System.out.println("\tTest Case 1");
        double mass = 40.0;
        double accel = 550.0;
        double accel2 = 2500.0;
        double expResult = 22000.0;
        double result = inventoryControl.kickDoor(mass, accel, accel2);
        assertEquals(expResult, result, 0.0);
       
        //Test Case 2
        System.out.println("\tTest Case 2");
        mass = 40.0;
        accel = 300.0;
        accel2 = 2500;
        expResult = -1;
        result = inventoryControl.kickDoor(mass, accel, accel2);
        assertEquals(expResult, result, 0.0);
       
        //Test Case 3
        System.out.println("\tTest Case 3");
        mass = 40.0;
        accel = 700;
        accel2 = 2500.0;
        expResult = -1;
        result = inventoryControl.kickDoor(mass, accel, accel2);
        assertEquals(expResult, result, 0.0);
       
        //Test Case 4
        System.out.println("\tTest Case 4");
        mass = 40.0;
        accel = 550.0;
        accel2 = 1500.0;
        expResult = 0;
        result = inventoryControl.kickDoor(mass, accel, accel2);
        assertEquals(expResult, result, 0.0);
       
        //Test Case 5
        System.out.println("\tTest Case 5");
        mass = 40.0;
        accel = 550.0;
        accel2 = 1500.0;
        expResult = 0;
        result = inventoryControl.kickDoor(mass, accel, accel2);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 6
        System.out.println("\tTest Case 6");
        mass = 40.0;
        accel = 450.0;
        accel2 = 2500.0;
        expResult = 22000.0;
        result = inventoryControl.kickDoor(mass, accel, accel2);
        assertEquals(expResult, result, 0.0);
       
        //Test Case 7
        System.out.println("\tTest Case 7");
        mass = 40.0;
        accel = 650.0;
        accel2 = 2500.0;
        expResult = 22000.0;
        result = inventoryControl.kickDoor(mass, accel, accel2);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 8
        System.out.println("\tTest Case 8");
        mass = 40.0;
        accel = 550.0;
        accel2 = 2500.0;
        expResult = 80000.0;
        result = inventoryControl.kickDoor(mass, accel, accel2);
        assertEquals(expResult, result, 0.0);
        
        //Test Case 9
        System.out.println("\tTest Case 9");
        mass = 40.0;
        accel = 450.0;
        accel2 = 5000.0;
        expResult = 200000.0;
        result = inventoryControl.kickDoor(mass, accel, accel2);
        assertEquals(expResult, result, 0.0);
    }
    
}
