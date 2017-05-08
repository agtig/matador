package matador;
/** Mellemklasse mellem 'Felt' og underliggende klasser som Gade og Rederi */

public class Grund2 extends Felt
{
	Spiller ejer;
	double pris;
	double grundleje;

	public Grund2(String navn, double pris, double leje)
	{
		this.priTekst=navn;
		this.pris=pris;
		this.grundleje=leje;
	}

	public double beregnLeje()
	{
		return grundleje;
	}

	public void landet(Spiller sp)
	{
		sp.besked("Du er landet på "+priTekst);
		if (sp==ejer)
		{                                       // spiller ejer feltet
			sp.besked("Det er din egen grund");
		}
		else if (ejer==null)
		{                                       // ingen ejer grunden, så køb den
			if (sp.konto > pris)
			{
				if (sp.spørgsmål("købe "+priTekst+" for "+pris))
				{
					sp.transaktion( -pris );
					ejer=sp;
				}
			}
			else sp.besked("Du har ikke penge nok til at købe "+priTekst);
		}
		else
		{                                       // felt ejes af anden spiller
			double leje = beregnLeje();           // udregn lejen
			sp.besked("Leje: "+leje);
			sp.betal(ejer, leje);                 // spiller betaler til ejeren
		}
	}
}