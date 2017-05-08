package matador;

import javax.swing.JFrame;

public class BenytMatadorspil
{
    private static JFrame spilVindue;

    public static void main(String[] arg)
    {
        Matadorspil spil = new Matadorspil();
    	
        spilVindue = new JFrame("Matador spil"); 
        spilVindue.add(new MatadorPanel());
        spilVindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        spilVindue.pack();
        spilVindue.setVisible(true);
                
        spil.spillere.add(new Spiller("Søren",50000));   // opret spiller Søren
        spil.spillere.add(new Spiller("Gitte",50000));   // opret spiller Gitte
        int toEns = 0;
        
        // løb gennem 20 runder (40 ture)
        for (spil.spillersTur=0; spil.spillersTur<40; spil.spillersTur++)
        {
            // tag skiftevis Søren og Gitte (% er forklaret i afsnit Fejl: Henvisningskilde ikke fundet)
            Spiller sp = spil.spillere.get(spil.spillersTur % spil.spillere.size());
            do {
                int slag1 = (int)(Math.random()*6)+1;     // og slå et terningkast på den første terning (1-6)
                int slag2 = (int)(Math.random()*6)+1;     // og slå et terningkast på den anden terning (1-6)
                if (slag1 == slag2) {toEns = 1;System.out.println("Yay! To ens!");} // tjek om der er slået 2 ens
                else {toEns = 0;}
                int slag = slag1 + slag2;                 // lægger de to terningers værdier sammen
                System.out.println("***** "+sp.navn+" på felt "+sp.feltnr+" slår "+slag1+" og "+slag2);

                for (int i=1; i<=slag; i=i+1)                  // nu rykkes der
                {
                    // gå til næste felt. Hvis vi når over antal felter så tæl fra 0
                    sp.feltnr = sp.feltnr + 1;
                    if (sp.feltnr == spil.felter.size()) sp.feltnr=0;
                    Felt felt = spil.felter.get(sp.feltnr);

                    if (i<slag) felt.passeret(sp); // kald passeret() på passerede felter
                    else felt.landet(sp);          // kald landet() på sidste felt
                    try { Thread.sleep(300); } catch (Exception e) {} // vent 0.3 sek
                }
            } while (toEns != 0);
            try { Thread.sleep(3000); } catch (Exception e) {} // tur slut, vent 3 sek
        }
    }
}