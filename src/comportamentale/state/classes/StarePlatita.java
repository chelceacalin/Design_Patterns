package comportamentale.state.classes;

public class StarePlatita implements Stare{

    @Override
    public void modificaStare(Rezervare rezervare) {

        if(!(rezervare.getStareaFacturii() instanceof StareNeplatita)){
            System.out.println("Nu puteti modifica starea in platita");
        }
        else {
            rezervare.setStareaFacturii(this);
            System.out.println("A fost schimbata starea in platita");
        }
    }
}
