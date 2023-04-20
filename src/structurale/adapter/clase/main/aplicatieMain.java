package structurale.adapter.clase.main;

import structurale.adapter.clase.adapter.SoftAdapter;
import structurale.adapter.clase.bar.ISoftBar;
import structurale.adapter.clase.bar.SoftBar;
import structurale.adapter.clase.bucatarie.ISoftRestaurant;
import structurale.adapter.clase.bucatarie.SoftRestaurant;

public class aplicatieMain {

    public static void imprimare(ISoftRestaurant restaurant,double val){
        restaurant.printeazaNota(val);
    }

    public static void main(String[] args) {
        ISoftBar bar=new SoftBar("Beraria H");
        bar.printeazaNotaBauturi(5);

        ISoftRestaurant bucatarie=new SoftRestaurant("Hatz");
        bucatarie.printeazaNota(15);

        SoftAdapter adapter=new SoftAdapter("Hatuleanu");
        adapter.printeazaNotaBauturi(5);

        imprimare(bucatarie,5);
    }
}
