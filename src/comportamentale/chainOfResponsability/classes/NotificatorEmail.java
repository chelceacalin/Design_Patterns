package comportamentale.chainOfResponsability.classes;

public class NotificatorEmail extends Notificator {


    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getAdresa_mail()!=null)
            System.out.println(client.getNume() + " ai un E-Mail cu mesajul " + mesaj);
        else
            super.getUrmator().notifica(client, mesaj);
    }
}