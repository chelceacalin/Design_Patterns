package creationale.factoryMethod.classes;

public class FactoryMedic {
    public PersonalSpital createPersonal(String name){
        return new Medic(name);
    }

}
