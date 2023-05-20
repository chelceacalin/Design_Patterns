package comportamentale.chainOfResponsability.main;

import comportamentale.chainOfResponsability.classes.*;

public class main {
    public static void main(String[] args) {
        Client c1=new Client("Alex",null,null);
        Client c2=new Client("Robert","123",null);
        Client c3=new Client("Ana",null,"144");
        Notificator notificatorSMS=new NotificatorSMS();
        Notificator notificatorEmail=new NotificatorEmail();
        Notificator notificatorManager=new NotificatorManager();

        notificatorSMS.setUrmator(notificatorEmail);
        notificatorEmail.setUrmator(notificatorManager);

        notificatorSMS.notifica(c1,"SALUT");
        notificatorSMS.notifica(c2,"BUNA");
        notificatorSMS.notifica(c3,"Doar EMAIL");
    }
}
