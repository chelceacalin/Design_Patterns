package structurale.composite.classes;

public class Item implements Optiune{

    public String denumire;

    public Item(String denumire) {
        this.denumire = denumire;
    }

   public void afiseaza(){
        System.out.println(" "+denumire);
    }

}
