package decorator.main;

import decorator.classes.IPrintable;
import decorator.classes.RezultatOnline;
import decorator.classes.RezultatPrintat;

public class main {
    public static void main(String[] args) {
        IPrintable hartie=new RezultatPrintat();
        hartie.afiseazaDiagnostic("COVID");

        IPrintable online=new RezultatOnline(hartie);
        online.afiseazaDiagnostic("COVID");
    }
}
