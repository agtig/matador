package matador;
/** En gade, der kan købes af en spiller og bebygges */
public class Skat extends Felt
{
    int type;
    
    public Skat(String navn, int type)
    {
        this.priTekst = navn;
        this.sekTekst = "";
        this.type = type;
    }

    public void landet(Spiller sp)
    {
        sp.besked("Du er landet på "+priTekst);

        // Her skal indsættes kode der indkræver skat af de to forskellige typer
        if (type == 0) {
            
        } else if (type == 1) {
            
        } else {
            System.out.println("Error in Skat! \"type\" is invalid.");
        }
    }
}