package creationale.Singleton.SingletonRegistry.main;

import creationale.Singleton.SingletonRegistry.classes.InstitutiePublica;

public class main {
    public static void main(String[] args) {
        /*
           Intr-o tara, sunt mai multe institutii care respecta design-ul singleton intrucat sunt unice,
           insa ele in sine sunt mai multe, pentru asta folosim singleton repository
         */
        InstitutiePublica institutiePublica=InstitutiePublica.getInstance("Politie",1);
        InstitutiePublica i2=InstitutiePublica.getInstance("Pompieri",2);
        InstitutiePublica i3=InstitutiePublica.getInstance("Pompieri",3);
        System.out.println(institutiePublica.toString());
        i3.setNumarAngajati(10);
        System.out.println(i2.toString());
        System.out.println(i3.toString());
    }
}
