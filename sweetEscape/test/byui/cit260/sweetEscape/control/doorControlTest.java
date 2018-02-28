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
public class doorControlTest {
    
    public doorControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcKeypad method, of class DoorControl.
     */
    @Test
    public void testCalcKeypad() {
        System.out.println("calcKeypad");
        
        // Test Case  1
        System.out.println("\tTest Case 1");
        double num = 1.0;
        double answer = 32.5;
        long expResult = 1056;
        long result = DoorControl.calcKeypad(num, answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        // Test Case  2
        System.out.println("\tTest Case 2");
        num = -1.0;
        answer = 31.5;
        expResult = -1;
        result = DoorControl.calcKeypad(num, answer);
        assertEquals(expResult, result);
        
        // Test Case  3
        System.out.println("\tTest Case 3");
        num = 136.0;
        answer = 100.0;
        expResult = -2;
        result = DoorControl.calcKeypad(num, answer);
        assertEquals(expResult, result);
        
        // Boundary Test 1
        System.out.println("\tTest Case 4");
        num = 0.0;
        answer = 32.0;
        expResult = 1024;
        result = DoorControl.calcKeypad(num, answer);
        assertEquals(expResult, result);
        
        // Boundary Test 2
        System.out.println("\tTest Case 5");
        num = 135.0;
        answer = 99.5;
        expResult = 9900;
        result = DoorControl.calcKeypad(num, answer);
        assertEquals(expResult, result);

    }
    
}
