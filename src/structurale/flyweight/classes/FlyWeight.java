package structurale.flyweight.classes;
import java.util.HashMap;
import java.util.Map;
public class FlyWeight {
    private Map<String, IClient> mapClient;

    public FlyWeight() {
        this.mapClient = new HashMap<>();
    }


    public IClient getDetinator(String nume, String nrTelefon, String adresa)
    {
        if(!mapClient.containsKey(nume))
        {
            IClient iClient=new Detinator(nume, nrTelefon,adresa);
            mapClient.put(nume,iClient);
            return iClient;
        }
        return mapClient.get(nume);
    }
}
