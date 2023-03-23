package Factory.factoryMethod.classes;

public class FactoryAsistent {
    public PersonalSpital createPersonal(String name){
        return new Asistent(name);
    }

}
