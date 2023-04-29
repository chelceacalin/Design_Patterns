package decorator.classes;

public class RezultatPrintat implements IPrintable{

    public void afiseazaDiagnostic(String diagnostic){
        System.out.println("HARTIE: "+diagnostic);
    }
}
