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
public class FeltTest {
    
    public FeltTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of passeret method, of class Felt.
     */
    @Test
    public void testPasseret() {
        System.out.println("passeret");
        Spiller sp = null;
        Felt instance = new Felt();
        instance.passeret(sp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of landet method, of class Felt.
     */
    @Test
    public void testLandet() {
        System.out.println("landet");
        Spiller sp = null;
        Felt instance = new Felt();
        instance.landet(sp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
