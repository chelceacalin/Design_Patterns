package creationale.factoryMethod.main;

import creationale.factoryMethod.classes.Asistent;
import creationale.factoryMethod.classes.FactoryAsistent;

public class main {
    public static void main(String[] args) {
        FactoryAsistent asistenti=new FactoryAsistent();
        Asistent a1=(Asistent) asistenti.createPersonal("Andrei");
        a1.afiseazaDescriere();

    }
}
