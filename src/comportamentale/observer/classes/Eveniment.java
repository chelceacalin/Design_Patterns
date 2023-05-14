package comportamentale.observer.classes;

public interface  Eveniment {

     void abonareClient(IClient client);
     void dezabonareClient(IClient client);

     void notificareClienti(String mesaj);
}
