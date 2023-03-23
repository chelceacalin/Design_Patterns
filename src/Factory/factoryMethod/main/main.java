package Factory.factoryMethod.main;

import Factory.factoryMethod.classes.Asistent;
import Factory.factoryMethod.classes.FactoryAsistent;

public class main {
    public static void main(String[] args) {
        FactoryAsistent asistenti=new FactoryAsistent();
        Asistent a1=(Asistent) asistenti.createPersonal("Andrei");
        a1.afiseazaDescriere();

    }
}
