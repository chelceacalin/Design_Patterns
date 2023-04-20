package structurale.proxy.classes;

public class Restaurant implements IRestaurant{
    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void rezervaMasa(int numarPersoane){
        System.out.println("Masa a fost rezervata de "+numarPersoane+" la restaurantul : "+this.nume);
    }
}
