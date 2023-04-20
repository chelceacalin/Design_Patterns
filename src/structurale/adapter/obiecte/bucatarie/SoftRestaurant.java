package structurale.adapter.obiecte.bucatarie;

public class SoftRestaurant implements ISoftRestaurant {
    private String denumire;

    public SoftRestaurant(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void printeazaNota(double totalSuma) {
        System.out.println("RESTAURANTUL "+this.denumire+" ,valoare: "+totalSuma);

    }
}
