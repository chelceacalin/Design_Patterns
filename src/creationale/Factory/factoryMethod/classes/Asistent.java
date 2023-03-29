package creationale.Factory.factoryMethod.classes;

public class Asistent extends PersonalSpital {

    public Asistent(String nume){ super(nume); }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getName()+" este "+this.getClass().getCanonicalName());
    }
}
