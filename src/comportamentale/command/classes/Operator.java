package comportamentale.command.classes;

public class Operator {
    public void invoca(ICommand command){
        command.executa();
    }
}
