package facade.classes;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> paturi;

    public Salon(){
       this.paturi=new ArrayList<>();
    }

    public List<Integer>getPaturi(){return this.paturi;}
    public void adaugaPat(int cod){
        this.paturi.add(cod);
    }

    public void ocupaPat(){
        this.paturi.remove(0);
    }
}
