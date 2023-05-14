package comportamentale.state.classes;

public class StareEfectuata implements Stare{

    @Override
    public void modificaStare(Rezervare rezervare) {

        if(rezervare.getStareaFacturii() instanceof StarePlatita){
            rezervare.setStareaFacturii(this);
            System.out.println("A fost schimbata starea in Efectuata");
        }
        else
        {
            System.out.println("Nu putem schimba starea in efectuata");
        }
    }
}
