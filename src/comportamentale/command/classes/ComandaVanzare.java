package comportamentale.command.classes;

public class ComandaVanzare implements ICommand{
    IPachet pachet;

    public ComandaVanzare(IPachet pachet) {
        this.pachet = pachet;
    }

    @Override
    public void executa() {
        this.pachet.vinde();
    }
}
