package comportamentale.template.classes;

public class PachetTuristic extends IPachet{
    public PachetTuristic(int cod) {
        super(cod);
    }

    @Override
    void cautaCazare() {
        System.out.println("S-a cazat "+this.getClass().getSimpleName()+", cu codul "+super.getCodPachet());
    }

    @Override
    void cautaTransport() {
        System.out.println("S-a cautat "+this.getClass().getSimpleName()+", cu codul "+super.getCodPachet());
    }

    @Override
    void rezervaPachetul() {
        System.out.println("S-a rezervat "+this.getClass().getSimpleName()+", cu codul "+super.getCodPachet());
    }

    @Override
    void platestePachetul() {
        System.out.println("S-a platit "+this.getClass().getSimpleName()+", cu codul "+super.getCodPachet());
    }
}
