package matador;
/** Et rederi, der kan købes af en spiller */
public class Bryggeri extends Felt
{
    Spiller ejer;
    double pris;
    double grundleje;

    public Bryggeri(String navn, double pris)
    {
        this.priTekst = navn;
        this.sekTekst = "";
        this.pris = pris;
    }

    public void landet(Spiller sp)
    {
        sp.besked("Du er landet på "+priTekst);
        // leje er afhængig af hvad terningen viste da spilleren landede på dette felt.
        this.grundleje = 600; // udregning mangler
    }
}