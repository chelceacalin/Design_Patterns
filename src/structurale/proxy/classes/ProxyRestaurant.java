package structurale.proxy.classes;

public class ProxyRestaurant implements IRestaurant {

    private IRestaurant iRestaurant;

    public ProxyRestaurant(IRestaurant iRestaurant) {
        this.iRestaurant = iRestaurant;
    }

    @Override
    public void rezervaMasa(int numarPersoane) {
        if (numarPersoane >= 4)
            iRestaurant.rezervaMasa(numarPersoane);
        else
            System.out.println("Nu se poate");
    }
}
