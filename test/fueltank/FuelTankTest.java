/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueltank;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class FuelTankTest {
    
    public FuelTankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTankLevel method, of class FuelTank.
     */
    @Test
    public void testGetTankLevel() {
        System.out.println("getTankLevel");
        FuelTank instance = null;
        double expResult = 0.0;
        double result = instance.getTankLevel();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTankMax method, of class FuelTank.
     */
    @Test
    public void testGetTankMax() {
        System.out.println("getTankMax");
        FuelTank instance = null;
        double expResult = 0.0;
        double result = instance.getTankMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class FuelTank.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        FuelTank instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class FuelTank.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        FuelTank instance = null;
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fill method, of class FuelTank.
     */
    @Test
    public void testFill() {
        System.out.println("fill");
        double amount = 0.0;
        FuelTank instance = null;
        instance.fill(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consume method, of class FuelTank.
     */
    @Test
    public void testConsume() {
        System.out.println("consume");
        double amount = 0.0;
        FuelTank instance = null;
        instance.consume(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
