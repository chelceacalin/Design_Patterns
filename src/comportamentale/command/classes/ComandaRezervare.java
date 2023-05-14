package comportamentale.command.classes;

public class ComandaRezervare implements ICommand{
    IPachet pachet;

    public ComandaRezervare(IPachet pachet) {
        this.pachet = pachet;
    }

    @Override
    public void executa() {
        pachet.rezerva();
    }
}
