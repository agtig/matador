package matador;
/** En gade, der kan købes af en spiller og bebygges */
public class Faengsel extends Felt
{
    String type;
    
    public Faengsel(String navn, String tekst)
    {
        this.priTekst = navn;
        this.sekTekst = "";
        this.type = tekst;
    }

    public void landet(Spiller sp)
    {
        sp.besked("Du er landet på "+priTekst);
        // først tjekkes om der er landet på "De fængsles" eller bare "Besøg"
        if (type.matches("fælde")) {
            
        }
        else {
            
        }
    }
}