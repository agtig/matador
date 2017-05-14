package matador;
/** Et rederi, der kan købes af en spiller */
public class Bryggeri extends Felt {
    Spiller ejer;
    double pris;
    double grundleje;

    public Bryggeri(String navn, double pris) {
        this.priTekst = navn;
        this.sekTekst = "";
        this.pris = pris;
        this.grundleje = 200;
    }

    public void landet(Spiller sp) {
        sp.besked("Du er landet på "+priTekst);
        if (sp==ejer) {                         // spiller ejer selv grunden
            sp.besked("Det er din egen grund");
        }
        else if (ejer==null) {                  // ingen ejer grunden, så køb den
            if (sp.konto > pris) {
                if (sp.spoergsmaal("købe "+priTekst+" for "+pris)) {
                    sp.transaktion( -pris );
                    ejer=sp;
                }
            }
            else sp.besked("Du har ikke penge nok til at købe "+priTekst);
        }
        else {                                  // feltet ejes af anden spiller
            // grundleje beregnes
            //if 
            sp.besked("Leje: "+(grundleje * sp.slag));
            sp.betal(ejer, (grundleje * sp.slag));// spiller betaler til ejeren
        }
    }
}