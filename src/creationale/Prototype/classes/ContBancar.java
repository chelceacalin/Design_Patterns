package creationale.Prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class ContBancar  implements IContCloneable{
    private String detinator;
    private Map<String,Integer> documente;
    private int numarFileDosar;

    public ContBancar(String detinator, Map<String, Integer> documente, int numarFileDosar) {
        int sum=0;
        for(Integer file: documente.values()){
            sum+=file;
        }
        if(sum==numarFileDosar){
            this.detinator = detinator;
            this.documente = documente;
            this.numarFileDosar = numarFileDosar;
        }
        else
            throw new IllegalArgumentException("Numar Incorect");
    }

    private ContBancar(){
        this.documente=null;
    }

    public void setDetinator(String detinator) {
        this.detinator = detinator;
    }

    @Override
    public IContCloneable clone() {
        ContBancar copie=new ContBancar();
        copie.detinator=this.detinator;
        copie.numarFileDosar=this.numarFileDosar;
        copie.documente=new HashMap<>();
        for(String key:this.documente.keySet()){
            copie.documente.put(key,this.documente.get(key));
        }
        return copie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("detinator='").append(detinator).append('\'');
        sb.append(", documente=").append(documente);
        sb.append(", numarFileDosar=").append(numarFileDosar);
        sb.append('}');
        return sb.toString();
    }
}
