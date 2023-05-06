package comportamentale.strategy.classes;

public class Client implements ModPlata{
    private String nume;
    private ModPlata modPlata;

    public Client(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", modPlata=" + modPlata +
                '}';
    }

    @Override
    public void plateste( double sumadePlata) {
        System.out.println(this.getClass().getSimpleName()+": "+this.nume+" plateste "+sumadePlata+" lei prin  "+this.modPlata.getClass().getSimpleName());
    }
}
