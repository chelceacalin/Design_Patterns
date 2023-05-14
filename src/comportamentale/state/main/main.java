package comportamentale.state.main;

import comportamentale.state.classes.Rezervare;
import comportamentale.state.classes.StareNeplatita;

public class main {
    public static void main(String[] args) {

        Rezervare r1=new Rezervare("Rezervarea 1");
        //System.out.println(r1.getStareaFacturii());

        r1.anuleazaFactura();
       r1.platesteFactura();
        r1.anuleazaFactura();
        r1.efectueazaFactura();
        r1.anuleazaFactura();
    }
}
