/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Robert Sand <robert@ssand.dk>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({matador.GadeTest.class, matador.LoekkenTest.class, matador.MatadorspilTest.class, matador.BryggeriTest.class, matador.FeltTest.class, matador.SkatTest.class, matador.MatadorFrameTest.class, matador.SpillerTest.class, matador.MatadorPanelTest.class, matador.FaengselTest.class, matador.ParkeringTest.class, matador.RederiTest.class, matador.BenytMatadorspilTest.class, matador.StartTest.class})
public class MatadorSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
