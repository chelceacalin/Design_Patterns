package facade.classes;

public class Pacient {
    private String nume;
    private int gravitate;


    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGravitate() {
        return gravitate;
    }

    public void setGravitate(int gravitate) {
        this.gravitate = gravitate;
    }


    public boolean verificaGravitate(){
        if(this.gravitate<4){
            System.out.println("Gravitatea e prea mica");
            return  false;
        }
        else
            return true;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", gravitate=" + gravitate +
                ", " + "este internat";
    }
}
