/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

/**
 *
 * @author Robert Sand <robert@ssand.dk>
 */
public class Ryk {
    
    public static void frem() {
        for (int i=1; i<=sp.slag; i=i+1) {       // nu rykkes der
            // gå til næste felt. Hvis vi når over antal felter så tæl fra 0
            sp.feltnr = sp.feltnr + 1;
            if (sp.feltnr == spil.felter.size()) sp.feltnr=0;
            Felt felt = spil.felter.get(sp.feltnr);

            if (i<sp.slag) felt.passeret(sp); // kald passeret() på passerede felter
            else felt.landet(sp);          // kald landet() på sidste felt
            try { Thread.sleep(300); } catch (Exception e) {} // vent 0.3 sek
        } // slut for - felt-rykke-løkke
    }
}
