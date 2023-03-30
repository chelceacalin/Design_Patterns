package creationale.simpleFactory.main;

import creationale.simpleFactory.classes.*;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        /*

         În cadrul aplicației personalul spitalului este de mai multe tipuri. Acestea sunt salvate într-un
        enum { Brancardier, Asistent, Medic}. Să se implementeze modulul care pune la dispoziției
        crearea de obiecte din familia obiectelor PersonalSpital in funcție de tipul primit ca parametru.
         */

        SimpleFactory simpleFactory=new SimpleFactory();
        Asistent asistent= (Asistent) simpleFactory.createPersonal(TipPersonal.ASISTENT,"Calin");
        Medic medic=(Medic) simpleFactory.createPersonal(TipPersonal.MEDIC,"George");
        Anestezist anestezist=(Anestezist) simpleFactory.createPersonal(TipPersonal.ANESTEZIST, new String[]{"Calin", "5"});
        List<Object> list=new ArrayList<>();

        list.add(medic);
        list.add(asistent);
        list.add(anestezist);

        asistent.afiseazaDescriere();;
        medic.afiseazaDescriere();;
        anestezist.afiseazaDescriere();;

    }
}
