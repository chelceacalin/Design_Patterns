package creationale.Builder.classes;

public interface IBuilder {

    ContBancar build();

     ContBuilder setPeCard(boolean peCard);

     ContBuilder setNumeClient(String numeClient);
}
