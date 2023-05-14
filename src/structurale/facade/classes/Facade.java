package structurale.facade.classes;

public class Facade {
   private Medic medic;
    Salon salon;

    public Facade(){
        medic=new Medic();
        medic.adaugaPacient(new Pacient("Roxana",5));
        medic.adaugaPacient(new Pacient("Alex",3));
        medic.adaugaPacient(new Pacient("Roberta",1));

        salon=new Salon();
        salon.adaugaPat(1);
        salon.adaugaPat(2);
        salon.adaugaPat(3);
    }

    public void interneazaPacient(String nume) {

        if(medic.getPacient(nume)!=null){
            Pacient p=medic.getPacient(nume);
                if(medic.verificaTrimitere(p)){
                    if(p.verificaGravitate()){
                        if(salon.getPaturi().size()>0){
                            salon.ocupaPat();
                            System.out.println(nume+" a fost internat");
                        }
                        else System.out.println("Nu mai sunt paturi");
                }


            }
                else System.out.println("Trimitere invalida");
        }
        else System.out.println("Pacient inexistent");



    }
}
