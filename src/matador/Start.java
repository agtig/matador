package matador;
/** Startfeltet - når en spiller passerer dette felt, får han 5000 kr */
public class Start extends Felt {
    double gevinst;

    public Start(String tekst1, String tekst2, double gevinst) {
        priTekst = tekst1;
        sekTekst = tekst2;
        this.gevinst = gevinst;
    }
    
    // tilsidesæt metode i Felt
    public void passeret(Spiller sp) {
        sp.besked("Du passerer start og modtager "+gevinst);
        sp.transaktion(gevinst);        // kredit/debit af konto
    }
    
    // tilsidesæt metode i Felt
    public void landet(Spiller sp) {
        sp.besked("Du lander på start og modtager "+gevinst);
        sp.transaktion(gevinst);        // kredit/debit af konto
    }
}