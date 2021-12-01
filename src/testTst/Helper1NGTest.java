/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testTst;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Helper1;

/**
 *
 * @author ctamayo
 */
public class Helper1NGTest {
    
    public Helper1NGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of addValues method, of class Helper1.
     */
    @Test
    public void testAddValues() {
        System.out.println("addValues");
        int a = 8;
        int b = 5;
        Helper1 instance = new Helper1();
        int expResult = 13;
        int result = instance.addValues(a, b);
        assertEquals(result, expResult);
    }

    /**
     * Test of multiplyValues method, of class Helper1.
     */
    @Test
    public void testMultiplyValues() {
        System.out.println("multiplyValues");
        int a = 5;
        int b = 6;
        Helper1 instance = new Helper1();
        int expResult = 30;
        int result = instance.multiplyValues(a, b);
        assertEquals(result, expResult);
    }
    
}
