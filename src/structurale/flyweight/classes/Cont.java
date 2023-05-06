package structurale.flyweight.classes;

public class Cont {
    private float suma;
    private int nrCont;

    public Cont(float suma, int nrCont) {
        this.suma = suma;
        this.nrCont = nrCont;
    }

    public float getSuma() {
        return suma;
    }

    public int getNrCont() {
        return nrCont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("suma=").append(suma);
        sb.append(", nrCont=").append(nrCont);
        sb.append('}');
        return sb.toString();
    }
}