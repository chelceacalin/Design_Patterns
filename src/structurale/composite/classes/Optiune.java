package structurale.composite.classes;

public interface Optiune {
    void afiseaza();
    default void adaugaNod(Optiune item){};
    default void stergeNod(Optiune item){};
    default Optiune getNod(int index){
        return null;
    };
}
