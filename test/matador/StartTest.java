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
public class StartTest {
    
    public StartTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of passeret method, of class Start.
     */
    @Test
    public void testPasseret() {
        System.out.println("passeret");
        Spiller sp = null;
        Start instance = null;
        instance.passeret(sp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of landet method, of class Start.
     */
    @Test
    public void testLandet() {
        System.out.println("landet");
        Spiller sp = null;
        Start instance = null;
        instance.landet(sp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
