package structurale.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune{
    String denumire;
    List<Optiune> lista;
    public Categorie(String denumire){
        this.denumire=denumire;
        this.lista=new ArrayList<>();
    }


    @Override
    public void afiseaza() {
        System.out.println("Categorie "+this.denumire);
        for(var item:lista){
           item.afiseaza();
        }
        System.out.println();
    }

    @Override
    public void adaugaNod(Optiune item) {
       lista.add(item);
    }

    @Override
    public void stergeNod(Optiune item) {
     lista.remove(item);
    }

    @Override
    public Optiune getNod(int index) {
        return  lista.get(index);
    }
}
