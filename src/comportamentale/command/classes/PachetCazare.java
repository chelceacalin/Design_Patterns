package comportamentale.command.classes;

public class PachetCazare implements IPachet{
    String nume;

    public PachetCazare(String nume) {
        this.nume = nume;
    }

    @Override
    public void rezerva() {
        System.out.println(this.getClass().getSimpleName()+" , numit "+nume+" a fost REZERVAT");
    }

    @Override
    public void vinde() {
        System.out.println(this.getClass().getSimpleName()+" , numit "+nume+" a fost VANDUT");
    }
}
