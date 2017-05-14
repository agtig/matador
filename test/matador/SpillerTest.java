/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robert Sand <robert@ssand.dk>
 */
public class SpillerTest {
    
    public SpillerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of besked method, of class Spiller.
     */
    @Test
    public void testBesked() {
        System.out.println("besked");
        String besked = "";
        Spiller instance = null;
        instance.besked(besked);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of spoergsmaal method, of class Spiller.
     */
    @Test
    public void testSpoergsmaal() {
        System.out.println("spoergsmaal");
        String spoergsmaal = "";
        Spiller instance = null;
        boolean expResult = false;
        boolean result = instance.spoergsmaal(spoergsmaal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transaktion method, of class Spiller.
     */
    @Test
    public void testTransaktion() {
        System.out.println("transaktion");
        double kr = 0.0;
        Spiller instance = null;
        instance.transaktion(kr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of betal method, of class Spiller.
     */
    @Test
    public void testBetal() {
        System.out.println("betal");
        Spiller modtager = null;
        double kr = 0.0;
        Spiller instance = null;
        instance.betal(modtager, kr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
