package structurale.adapter.obiecte.main;

import structurale.adapter.obiecte.adapter.SoftAdapter;
import structurale.adapter.obiecte.bar.ISoftBar;
import structurale.adapter.obiecte.bar.SoftBar;
import structurale.adapter.obiecte.bucatarie.ISoftRestaurant;
import structurale.adapter.obiecte.bucatarie.SoftRestaurant;

public class aplicatieMain {

    public static void imprimare(ISoftRestaurant restaurant, double val){
        restaurant.printeazaNota(val);
    }

    public static void main(String[] args) {
        ISoftBar bar=new SoftBar("Beraria H");
        bar.printeazaNotaBauturi(5);

        ISoftRestaurant bucatarie=new SoftRestaurant("Hatz");
        bucatarie.printeazaNota(15);

        SoftAdapter adapter=new SoftAdapter((SoftBar) bar);
        adapter.printeazaNota(5);


        imprimare(bucatarie,5);
    }
}
