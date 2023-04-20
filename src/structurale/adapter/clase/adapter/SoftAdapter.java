package structurale.adapter.clase.adapter;

import structurale.adapter.clase.bar.ISoftBar;
import structurale.adapter.clase.bucatarie.SoftRestaurant;

public class SoftAdapter extends SoftRestaurant implements ISoftBar {


    public SoftAdapter(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNotaBauturi(double totalPlata) {
            this.printeazaNota(totalPlata);
    }
}
