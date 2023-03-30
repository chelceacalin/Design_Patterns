package creationale.Builder.main;

import creationale.Builder.classes.ContBancar;
import creationale.Builder.classes.ContBuilder;
import creationale.Builder.classes.IBuilder;

public class main {

    public static void main(String[] args) {

        IBuilder builder=new ContBuilder();
         builder.setNumeClient("Rares");
        ContBancar c1= builder.build();
        ContBancar c2=builder.build();
        c2.setNumeClient("Alex");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
