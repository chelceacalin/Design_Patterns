package creationale.Builder.classes;

public class ContBancar {
    private String numeClient;
    private boolean peCard;
    private boolean internetBanking;
    private boolean primesteSalariu;

    protected ContBancar(String numeClient, boolean peCard, boolean internetBanking, boolean primesteSalariu) {
        this.numeClient = numeClient;
        this.peCard = peCard;
        this.internetBanking = internetBanking;
        this.primesteSalariu = primesteSalariu;
    }

    public String getNumeClient() {
        return numeClient;
    }
    public boolean isPeCard() {
        return peCard;
    }
    public boolean isInternetBanking() {
        return internetBanking;
    }
    public boolean isPrimesteSalariu() {
        return primesteSalariu;
    }


    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }
    public void setPeCard(boolean peCard) {
        this.peCard = peCard;
    }
    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", peCard=").append(peCard);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append(", primesteSalariu=").append(primesteSalariu);
        sb.append('}');
        return sb.toString();
    }
}
