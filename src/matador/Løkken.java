package matador;
/** En gade, der kan købes af en spiller og bebygges */
public class Løkken extends Felt
{
	
    public Løkken(String navn)
    {
        this.priTekst = navn;
        this.sekTekst = "";
    }

    public void landet(Spiller sp)
    {
        sp.besked("Du er landet på "+priTekst);

        // Her skal indsættes kode der læser prøvløkken-kortene
            
    }
}