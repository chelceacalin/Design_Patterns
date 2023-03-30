package creationale.Builder.classes;

public class ContBuilder implements IBuilder{

    ContBancar contBancar;

    public ContBuilder() {
        this.contBancar = new ContBancar("Anonim",false,false,false);
    }

    public ContBuilder setNumeClient(String numeClient) {
       this.contBancar.setNumeClient(numeClient);
       return this;
    }
    public ContBuilder setPeCard(boolean peCard) {
        this.contBancar.setPeCard(peCard);
        return this;
    }
    public ContBuilder setInternetBanking(boolean internetBanking) {
       this.contBancar.setInternetBanking(internetBanking);
       return  this;
    }

    public ContBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.contBancar.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    @Override
    public ContBancar build() {
        return new ContBancar(contBancar.getNumeClient(), contBancar.isPeCard(),contBancar.isInternetBanking(),contBancar.isPrimesteSalariu());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBuilder{");
        sb.append("contBancar=").append(contBancar);
        sb.append('}');
        return sb.toString();
    }
}
