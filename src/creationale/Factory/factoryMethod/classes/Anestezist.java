package creationale.Factory.factoryMethod.classes;

public class Anestezist extends PersonalSpital {

    private int aniExp;
    public Anestezist(String nume,int aniExp){ super(nume); this.aniExp=aniExp; }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getName() + " este "+this.getClass().getCanonicalName()+" si are "+this.aniExp+ " ani experienta");
    }
}
