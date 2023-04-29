package decorator.classes;

public class RezultatDecorator implements IPrintable{
    IPrintable rezultat;

    public RezultatDecorator(IPrintable rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void afiseazaDiagnostic(String diagnostic) {
        System.out.println("Diagnosticul este: "+diagnostic);
    }
}
