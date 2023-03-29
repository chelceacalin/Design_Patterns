package creationale.Singleton.SimpleSingleton.classes;

public class Secretariat {
    private int numarBirouri;
    private int numarAngajati;
    private static Secretariat instanta=null;
    private static int nrInstante=0;

    private Secretariat(int numarBirouri,int numarAngajati){
        this.numarAngajati=numarAngajati;
        this.numarBirouri=numarBirouri;
    }

    public void setNumarBirouri(int numarBirouri) {
        this.numarBirouri = numarBirouri;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public synchronized static Secretariat getInstanta(int numarBirouri,int numarAngajati){
        if(Secretariat.instanta==null){
            Secretariat.instanta=new Secretariat(numarBirouri,numarAngajati);
        }
        nrInstante++;
        return Secretariat.instanta;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Secretariat: "+nrInstante+  " { ");
        sb.append("numarBirouri=").append(numarBirouri);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append(" }");
        return sb.toString();
    }
}
