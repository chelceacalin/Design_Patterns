package creationale.factoryMethod.classes;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume){ super(nume); }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getName()+" este "+this.getClass().getCanonicalName());
    }
}
