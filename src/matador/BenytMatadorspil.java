package matador;

import javax.swing.JFrame;

public class BenytMatadorspil
{
    private static JFrame spilVindue;

    public static void main(String[] arg)
    {
        Matadorspil spil = new Matadorspil();
        Terning terning = new Terning();
    	
        spilVindue = new JFrame("Matador spil"); 
        spilVindue.add(new MatadorPanel());
        spilVindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        spilVindue.pack();
        spilVindue.setVisible(true);
        
        // Opret spillere
        int antal = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(
                "Hvor mange spillere skal der være med?", "2"));    // Spørg efter hvor mange der skal være med
        for (int i = 0; i < antal; i++ ) {
            spil.spillere.add(new Spiller(
                    javax.swing.JOptionPane.showInputDialog(
                    "Hvad hedder spiller " + (i+1) +"?", ""), // Spørg efter spillerens navn
                    50000));   // giv spilleren en start formue
        } // slut opret spillere løkke
        
        // sæt start variable for kontrol af terningslag og modtagne slag
        int toEns = 0;
        int[] slag;
        
        // løb gennem 20 runder (40 ture)
        for (spil.spillersTur=0; spil.spillersTur<40; spil.spillersTur++) {
            // tag skiftevis spillerne (% er forklaret i afsnit Fejl: Henvisningskilde ikke fundet)
            Spiller sp = spil.spillere.get(spil.spillersTur % spil.spillere.size());
            if (sp.iFængsel == 0) {
                do {
                    slag = Terning.slaa();            // slå med terningen
                    if (slag[0] == slag[1]) {toEns = 1;System.out.println("Yay! To ens!");} // tjek om der er slået 2 ens
                    else {toEns = 0;}
                    sp.slag = slag[0] + slag[1];                 // lægger de to terningers værdier sammen
                    System.out.println("***** "+sp.navn+" på felt "+sp.feltnr+" slår "+slag[0]+" og "+slag[1]);

                    for (int i=1; i<=sp.slag; i=i+1) {       // nu rykkes der
                        // gå til næste felt. Hvis vi når over antal felter så tæl fra 0
                        sp.feltnr = sp.feltnr + 1;
                        if (sp.feltnr == spil.felter.size()) sp.feltnr=0;
                        Felt felt = spil.felter.get(sp.feltnr);

                        if (i<sp.slag) felt.passeret(sp); // kald passeret() på passerede felter
                        else felt.landet(sp);          // kald landet() på sidste felt
                        try { Thread.sleep(300); } catch (Exception e) {} // vent 0.3 sek
                    } // slut for - felt-rykke-løkke
                } while (toEns != 0); // slut do loop - gentages hvis der var slået 2 ens.
            } // slut if - ikke i fængsel
            else {
                System.out.println("***** "+sp.navn+" er i fængsel! Antal runder i Fængsel: " + sp.iFængsel);
                    switch(sp.iFængsel) {
                        case '1' :
                        case '2' :
                            if (sp.spoergsmaal("Vil du betale kautionen på 1000 kr. for at slippe ud af fængslet?")) {
                                sp.transaktion(-1000);
                            } else {
                                int forsoeg = 0;
                                do {
                                    slag = Terning.slaa();              // slå med terningen
                                    if (slag[0] == slag[1]) {           // tjek om der er slået 2 ens
                                        sp.slag = slag[0] + slag[1];    // gem slag på spiller
                                        toEns = 1;                      // sæt toEns til 1
                                        System.out.println("Yay! To ens!");
                                    } // slut if - 2 ens tjek
                                    forsoeg ++;                         // tæl op antal forsøg
                                } while (forsoeg <=3 && toEns !=1);
                                // ryk frem på spillepladen med det slåede antal øjne
                                if (toEns == 1) {
                                    sp.iFængsel = 0;
                                    // her rykkes der
                                } // slut if - hvis man kom ud af fængslet
                            } // slut else - hvis man valgte at slå med terningerne
                            sp.iFængsel ++;
                            break;
                        case '3' :
                            int forsoeg = 0;
                                do {
                                    slag = Terning.slaa();              // slå med terningen
                                    if (slag[0] == slag[1]) {           // tjek om der er slået 2 ens
                                        sp.slag = slag[0] + slag[1];    // gem slag på spiller
                                        toEns = 1;                      // sæt toEns til 1
                                        System.out.println("Yay! To ens!");
                                    } // slut if - 2 ens tjek
                                    forsoeg ++;                         // tæl op antal forsøg
                                } while (forsoeg <=3 && toEns !=1);
                                // ryk frem på spillepladen med det slåede antal øjne
                                if (toEns != 1) {
                                    sp.spoergsmaal("Du skal betale kautionen på 1000 kr. for at slippe ud af fængslet!");
                                    sp.transaktion(-1000);
                                    sp.iFængsel = 0;
                                    // her rykkes der
                                } // slut if - hvis man kom ud af fængslet
                            break;
                        default :
                    }
            }
            try { Thread.sleep(3000); } catch (Exception e) {} // tur slut, vent 3 sek
        } // slut for - spillets lykke
    } // slut main
    
//    public void frem() {
//        for (int i=1; i<=sp.slag; i=i+1) {       // nu rykkes der
//            // gå til næste felt. Hvis vi når over antal felter så tæl fra 0
//            main.sp.feltnr = main.sp.feltnr + 1;
//            if (sp.feltnr == spil.felter.size()) sp.feltnr=0;
//            Felt felt = spil.felter.get(sp.feltnr);
//
//            if (i<sp.slag) felt.passeret(sp); // kald passeret() på passerede felter
//            else felt.landet(sp);          // kald landet() på sidste felt
//            try { Thread.sleep(300); } catch (Exception e) {} // vent 0.3 sek
//        } // slut for - felt-rykke-løkke
//    }
    
} // slut BenytMatadorspil