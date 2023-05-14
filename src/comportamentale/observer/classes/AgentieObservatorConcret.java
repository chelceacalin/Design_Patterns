package comportamentale.observer.classes;

import java.util.ArrayList;
import java.util.List;

public class AgentieObservatorConcret implements Eveniment{
    private String nume;
    private List<IClient> clientList;


    public AgentieObservatorConcret(String numeAgentie) {
        this.nume=numeAgentie;
        clientList=new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        clientList.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        clientList.remove(client);
    }

    @Override
    public void notificareClienti(String mesaj) {
        for(var c:clientList){
            c.primesteNotificare(mesaj);
        }
    }

    public void notificareOfertaNoua(){
        notificareClienti("A fost adaugata o noua oferta. Consultati noul nostru catalog!");
    }

}
