package structurale.composite.main;

import structurale.composite.classes.Categorie;
import structurale.composite.classes.Item;

public class main {
    public static void main(String[] args) {
        Item i1=new Item("Combustie1");
        Item i2=new Item("Combustie2");
        Item i3=new Item("Electric");
        Item i4=new Item("Hibrid");

        Categorie c1=new Categorie("All");

        Categorie subCategorie=new Categorie("Chiar toate");
        c1.adaugaNod(subCategorie);
        subCategorie.adaugaNod(i1);
        subCategorie.adaugaNod(i2);
        subCategorie.adaugaNod(i3);
        subCategorie.adaugaNod(i4);

        Categorie c2=new Categorie("Reducere Impozit");
        c2.adaugaNod(i3);
        c2.adaugaNod(i4);

        c1.afiseaza();
        c2.afiseaza();
    }
}
