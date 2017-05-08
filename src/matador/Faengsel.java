package matador;
/** En gade, der kan købes af en spiller og bebygges */
public class Faengsel extends Felt
{
	
	public Faengsel(String navn, String tekst)
	{
		this.priTekst = navn;
                this.sekTekst = tekst;
        }

	public void landet(Spiller sp)
	{
            sp.besked("Du er landet på "+priTekst);

            // Her skal indsættes kode der håndterer fængselsbesøg
            
	}
}