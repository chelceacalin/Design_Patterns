package comportamentale.strategy.main;

import comportamentale.strategy.classes.Card;
import comportamentale.strategy.classes.Cash;
import comportamentale.strategy.classes.Client;
import comportamentale.strategy.classes.ModPlata;

public class main {
    public static void main(String[] args) {

        ModPlata mp1=new Card();
        ModPlata mp2=new Cash();


        Client c1=new Client("Robert",mp1);
        Client c2=new Client("Alex",mp2);
        c1.plateste(5);
        c1.setModPlata(mp2);
        c1.plateste(5);
        c2.plateste(6);
    }
}
