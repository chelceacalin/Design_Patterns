package comportamentale.state.classes;

public class Rezervare {
    private String nume;
    private Stare stareaFacturii;

    public Rezervare(String nume) {
        this.nume = nume;
        this.stareaFacturii=new StareNeplatita();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Stare getStareaFacturii() {
        return stareaFacturii;
    }

    public void setStareaFacturii(Stare stareaFacturii) {
        this.stareaFacturii = stareaFacturii;
    }


    public void platesteFactura(){
        StarePlatita stare=new StarePlatita();
        stare.modificaStare(this);
    }

    public void anuleazaFactura(){
        StareNeplatita stareNeplatita=new StareNeplatita();
        stareNeplatita.modificaStare(this);
    }

    public void efectueazaFactura(){
        StareEfectuata stareEfectuata=new StareEfectuata();
        stareEfectuata.modificaStare(this);
    }
}
