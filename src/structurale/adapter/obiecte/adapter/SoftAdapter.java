package structurale.adapter.obiecte.adapter;

import structurale.adapter.obiecte.bar.SoftBar;
import structurale.adapter.obiecte.bucatarie.ISoftRestaurant;

public class SoftAdapter implements ISoftRestaurant {

    SoftBar sr;

    public SoftAdapter(SoftBar sr) {
        this.sr=sr;
    }


    @Override
    public void printeazaNota(double totalSuma) {
        sr.printeazaNotaBauturi(totalSuma);
    }
}
