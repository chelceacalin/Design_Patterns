package comportamentale.command.main;

import comportamentale.command.classes.*;

public class main {
    public static void main(String[] args) {
        IPachet p1=new PachetTransport("Pachet 1");
        IPachet p2=new PachetCazare("Pachet 2");

        p1.vinde();
        p1.rezerva();

        ICommand c1=new ComandaRezervare(p1);
        ICommand c2=new ComandaVanzare(p1);
        c1.executa();
        c2.executa();

        Operator o1=new Operator();
        o1.invoca(c1);
        o1.invoca(c2);
    }
}
