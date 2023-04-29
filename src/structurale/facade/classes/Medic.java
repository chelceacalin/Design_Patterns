package facade.classes;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private List<Pacient> pacientList;
    public Medic(){
        pacientList=new ArrayList<>();
    }

    public void adaugaPacient(Pacient p){
        pacientList.add(p);
    }

    public Pacient getPacient(String nume){
        for(Pacient p:pacientList){
            if(p.getNume().equals(nume)){
                return p;
            }
        }
        return  null;
    }

    public Boolean verificaTrimitere(Pacient pacient) {
        return this.pacientList.contains(pacient);
    }
}
