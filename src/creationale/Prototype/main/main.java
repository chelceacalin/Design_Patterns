package creationale.Prototype.main;

import creationale.Prototype.classes.ContBancar;
import creationale.Prototype.classes.IContCloneable;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("Doc1",4);
        mp.put("Doc2",1);
        IContCloneable cont=new ContBancar("Calin",mp,5);
        ContBancar c2= (ContBancar) cont.clone();
        c2.setDetinator("raresn");

        System.out.println(cont.toString());


        System.out.println(c2);
    }
}
