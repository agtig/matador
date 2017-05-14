/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robert Sand <robert@ssand.dk>
 */
public class BryggeriTest {
    
    public BryggeriTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ArrayList<Spiller> spillere = new ArrayList<Spiller>();  // alle spillere
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of landet method, of class Bryggeri.
     */
    @Test
    public void testLandet() {
        System.out.println("landet, og grunden er ejet af en anden, og der landes med en 6'er");
        String navn = "Tuborg";
        double pris = 2000;
        Bryggeri instance = new Bryggeri(navn, pris);
        
        
        instance.landet(sp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
