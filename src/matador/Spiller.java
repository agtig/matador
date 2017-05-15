package matador;
/** Definition af en spiller */
public class Spiller {
    String navn;        // spillerens navn, f.eks. "Søren"
    double konto;       // antal kroner på spillerens konto
    int feltnr;         // hvad nummer felt spilleren står på. rdquoStartrdquo er nummer 0
    int slag;           // slaget som spilleren slog sidst.
    int iFaengsel;       // er spilleren i fængsel? (1=ja, 0=nej)

    public Spiller(String navn, double konto) {
        this.navn = navn;   // spillerens navn sættes
        this.konto = konto; // spilleren modtager et startbeløb på sin konto
        feltnr = 0;         // spilleren starter på start-feltet
        iFaengsel = 0;       // spilleren starter med ikke at være i fængsel
    }

    /** En besked til spilleren */
    public void besked(String besked) {
        System.out.println(navn+": "+besked);
    }

    /** Et ja/nej-spørgsmål. Svarer brugeren ja returneres true, ellers false */
    public boolean spoergsmaal(String spoergsmaal) {
        String spm = navn+": Vil du "+spoergsmaal+"?";
        String svar = javax.swing.JOptionPane.showInputDialog(spm, "ja");
        System.out.println(spm+" "+svar);
        if (svar!=null && svar.equals("ja")) return true;
        else return false;
    }

    public void transaktion(double kr) {
        konto = konto + kr;
        System.out.println(navn+"s konto lyder nu på "+konto+" kr.");
    }

    public void betal(Spiller modtager, double kr) {
        System.out.println(navn+" betaler "+modtager.navn+": "+kr+" kr.");
        modtager.transaktion(kr);
        transaktion(-kr);
    }
}