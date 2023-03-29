package creationale.Factory.factoryMethod.classes;

public class FactoryBrancardier {
    public PersonalSpital createPersonal(String name){
        return new Brancardier(name);
    }
}
