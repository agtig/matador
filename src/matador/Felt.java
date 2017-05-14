package matador;
/** Superklassen for alle matadorspillets felter */
public class Felt {
    String priTekst;       // feltets primære tekst (typisk navn), f.eks. "Hvidovrevej"
    String sekTekst;       // feltets sekundære tekst
    
    /** kaldes når en spiller passerer dette felt */
    public void passeret(Spiller sp) {
        sp.besked("Du passerer "+priTekst);
    }

    /** kaldes når en spiller lander på dette felt */
    public void landet(Spiller sp) {
        
    }
}