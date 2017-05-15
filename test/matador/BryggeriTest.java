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
//        Matadorspil spil = new Matadorspil();
//        spil.spillere.add(new Spiller("Robert", 50000));                
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of landet method, of class Bryggeri.
     */
    @Test
    public void testLandet() {
        System.out.println("landet, og grunden er ejet af en anden, og der landes med en 6'er \nDer forventes en leje på 2400.0");
        String navn = "Tuborg";
        double pris = 2000;
        Bryggeri instance = new Bryggeri(navn, pris);
        Spiller sp = new Spiller("Eun-Young", 50000);
        instance.grundleje = 200;
        instance.ejer = sp;
        sp = new Spiller("Robert", 50000);
        sp.slag = 12;
        double expResult = 2400;       
        instance.landet(sp);
        //System.out.println(instance.grundleje * sp.slag);
        //assert
    }
    
}
