package creationale.Factory.simpleFactory.classes;

public class SimpleFactory {
    public PersonalSpital createPersonal(TipPersonal tipPersonal,String ...args){
        switch (tipPersonal){
            case MEDIC :  return new Medic(args[0]);
            case ASISTENT : return new Asistent(args[0]);
            case BRANCARDIER : return new Brancardier(args[0]);
            case ANESTEZIST: return new Anestezist(args[0],Integer.parseInt(args[1]));
            default: return null;
        }
    }

}
