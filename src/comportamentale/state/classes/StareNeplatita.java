package comportamentale.state.classes;

public class StareNeplatita implements Stare{

    @Override
    public void modificaStare(Rezervare rezervare) {

        if(!(rezervare.getStareaFacturii() instanceof StareEfectuata)){
            System.out.println("Nu puteti modifica starea in Neplatita");
        }
        else {
            rezervare.setStareaFacturii(this);
            System.out.println("A fost schimbata starea in Neplatita");
        }
    }
}
