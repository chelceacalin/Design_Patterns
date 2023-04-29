package decorator.classes;

public class RezultatOnline extends RezultatDecorator{
    public RezultatOnline(IPrintable rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseazaDiagnostic(String diagnostic) {

        System.out.println("Online "+diagnostic);
    }
}
