package creationale.Singleton.SimpleSingleton.main;

import creationale.Singleton.SimpleSingleton.classes.BazaDeDate;
import creationale.Singleton.SimpleSingleton.classes.Secretariat;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
/*
*  Vrem sa gestionam studentii din cadrul unei facultati. Trebuie sa ne asiguram ca toti studentii apeleaza
*  la acelasi secretariat pentru rezolvarea problemelor
* */
        List< Object> list=new ArrayList<>();
        Secretariat s1=Secretariat.getInstanta(5,10);
        Secretariat s2=Secretariat.getInstanta(6,5);
        list.add(s1);
        list.add(s2);
        list.stream().forEach(elem-> System.out.println(elem.toString()));
        s2.setNumarAngajati(69);
        list.stream().forEach(elem-> System.out.println(elem.toString()));


        BazaDeDate b1=BazaDeDate.getInstanta();
        BazaDeDate b2=BazaDeDate.getInstanta();

        list.add(b1);
        list.add(b2);

        list.stream().forEach(elem-> System.out.println(elem.toString()));

        b2.setDimensiuneDate(50);
        list.stream().forEach(elem-> System.out.println(elem.toString()));

    }
}
