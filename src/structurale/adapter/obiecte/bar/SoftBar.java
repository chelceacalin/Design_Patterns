package structurale.adapter.obiecte.bar;

public class SoftBar implements ISoftBar {
    private String denumire;

    public SoftBar(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void printeazaNotaBauturi(double totalPlata) {
        System.out.println("Barul "+this.denumire+" ,valoare: "+totalPlata);
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

}
