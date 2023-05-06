package structurale.flyweight.classes;

public class Detinator  implements IClient{
    private String nume;

    private String nrTelefon;

    private String adresa;

    public Detinator(String nume, String nrTelefon, String adresa) {

        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    @Override
    public void descriere(Cont cont) {
        System.out.println(this.toString()+cont.toString());
    }


}