package Singleton.SingletonRegistry.classes;

import java.util.LinkedHashMap;
import java.util.Map;

public class InstitutiePublica {
    private String denumire;
    private int numarAngajati;
    private static Map<String,InstitutiePublica> institutii=new LinkedHashMap<>();

    private InstitutiePublica(String denumire,int numarAngajati){
        this.denumire=denumire;
        this.numarAngajati=numarAngajati;
    }

    public static InstitutiePublica getInstance(String denumire,int numarAngajati){
        if(institutii.get(denumire)==null){
            institutii.put(denumire,new InstitutiePublica(denumire,numarAngajati));
        }

        return institutii.get(denumire);
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InstitutiePublica{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
