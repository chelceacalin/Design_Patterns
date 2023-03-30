package creationale.simpleFactory.classes;

public class Medic extends PersonalSpital{

    public Medic(String nume){ super(nume); }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getName()+" este "+this.getClass().getCanonicalName());
    }
}
