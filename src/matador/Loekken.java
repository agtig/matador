package matador;
/** En gade, der kan købes af en spiller og bebygges */
public class Loekken extends Felt {
	
    public Loekken(String navn) {
        this.priTekst = navn;
        this.sekTekst = "";
    }

    public void landet(Spiller sp) {
        sp.besked("Du er landet på "+priTekst);

        // Her skal indsættes kode der læser prøvløkken-kortene   
        sp.besked("Prøv Løkken kortene er væk, men vi håber vi finder dem senere.");
    }
}