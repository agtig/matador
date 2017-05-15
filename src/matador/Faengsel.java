package matador;
/** En gade, der kan købes af en spiller og bebygges */
public class Faengsel extends Felt {
    String type;
    
    public Faengsel(String navn, String tekst, String type) {
        this.priTekst = navn;
        this.sekTekst = tekst;
        this.type = type;
    }

    @Override
    public void landet(Spiller sp) {
        sp.besked("Du er landet på "+priTekst);
        // først tjekkes om der er landet på "De fængsles" eller bare "Besøg"
        if (this.type.matches("fanget")) {
            sp.iFaengsel = 1;
            sp.feltnr = 10;
        }
        else {
            // gør ingenting, da spilleren bare er på besøg
        }
    }
}