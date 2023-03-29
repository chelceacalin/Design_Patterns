package creationale.factoryMethod.classes;

public abstract class PersonalSpital {
    private String name;
    public PersonalSpital(String name){
        this.name=name;
    }


    protected String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public abstract void afiseazaDescriere();

}
