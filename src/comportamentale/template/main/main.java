package comportamentale.template.main;

import comportamentale.template.classes.IPachet;
import comportamentale.template.classes.PachetTuristic;

public class main {
    public static void main(String[] args) {

        IPachet pachet=new PachetTuristic(5);
        pachet.realizeazaPlata();
    }
}
