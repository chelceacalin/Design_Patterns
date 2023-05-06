package comportamentale.strategy.classes;

public class Card implements ModPlata{
    @Override
    public void plateste( double sumadePlata) {
        System.out.println(this.getClass().getSimpleName()+":  a platit "+sumadePlata+" lei");
    }
}
