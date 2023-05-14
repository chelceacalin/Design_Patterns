package comportamentale.observer.main;

import comportamentale.observer.classes.AgentieObservatorConcret;
import comportamentale.observer.classes.Client;
import comportamentale.observer.classes.Eveniment;

public class main {
    public static void main(String[] args) {
        Client c1= new Client(1,"Radu");
        Client c2=new Client(2,"Alex");
        Client c3=new Client(3,"Calin");

        Eveniment ev=new AgentieObservatorConcret("Agentia 1");
        ev.abonareClient(c1);
        ev.abonareClient(c2);


        ev.notificareClienti("Reducere la parbrize");

        ev.dezabonareClient(c2);
        ev.abonareClient(c3);
        ev.notificareClienti("Alta reducere");

        AgentieObservatorConcret a1=new AgentieObservatorConcret("a2");
        a1.abonareClient(c1);
        a1.notificareOfertaNoua();

    }
}
