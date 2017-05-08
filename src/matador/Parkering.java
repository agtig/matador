package matador;
/** Helle - hvis man lander her får man en gevinst */
public class Parkering extends Felt
{
    double gevinst;

    public Parkering (String navn)
    {
        this.priTekst = navn;                 // navn er arvet fra Felt
        this.sekTekst = "";
        this.gevinst = 6000;
    }

    public void landet(Spiller sp)    // tilsidesæt metode i Felt
    { 
        sp.besked("Du lander på " + this.priTekst + "og får overført " + gevinst);
        sp.transaktion(gevinst);        // opdater spillers konto
    }
}