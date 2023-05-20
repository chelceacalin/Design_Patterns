package comportamentale.chainOfResponsability.classes;

public  abstract class Notificator {
    Notificator urmator;

    public Notificator getUrmator() {
        return urmator;
    }

    public void setUrmator(Notificator urmator) {
        this.urmator = urmator;
    }


    public abstract void notifica(Client client,String mesaj);
}
