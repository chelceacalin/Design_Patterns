package comportamentale.observer.classes;

public class Client implements IClient{
    private  int id;
    private String nume;

    public Client(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume+" a primit notificarea: "+mesaj);
    }
}
