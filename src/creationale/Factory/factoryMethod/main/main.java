package creationale.Factory.factoryMethod.main;

import creationale.Factory.factoryMethod.classes.Asistent;
import creationale.Factory.factoryMethod.classes.FactoryAsistent;

public class main {
    public static void main(String[] args) {
        FactoryAsistent asistenti=new FactoryAsistent();
        Asistent a1=(Asistent) asistenti.createPersonal("Andrei");
        a1.afiseazaDescriere();

    }
}
