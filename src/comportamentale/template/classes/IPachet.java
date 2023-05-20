package comportamentale.template.classes;

public abstract class IPachet {

    private int codPachet;
    public IPachet(int cod){
        this.codPachet=cod;
    }
    abstract void cautaCazare();
    abstract void cautaTransport();
    abstract void rezervaPachetul();
    abstract void platestePachetul();
    public final void realizeazaPlata(){
            cautaCazare();
            cautaTransport();
            rezervaPachetul();
            platestePachetul();
    }

    public int getCodPachet() {
        return codPachet;
    }
}
