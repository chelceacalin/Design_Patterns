package structurale.proxy.main;

import structurale.proxy.classes.ProxyRestaurant;
import structurale.proxy.classes.Restaurant;

public class main {
    public static void main(String[] args) {
        ProxyRestaurant proxyRestaurant=new ProxyRestaurant(new Restaurant("Dorobat"));
        proxyRestaurant.rezervaMasa(3);
        proxyRestaurant.rezervaMasa(4);
    }
}
