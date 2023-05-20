package comportamentale.memento.main;

import comportamentale.memento.classes.Editor;
import comportamentale.memento.classes.EditorState;
import comportamentale.memento.classes.History;

public class main {
    public static void main(String[] args) {
        History history=new History();
        Editor editor=new Editor();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());


        editor.setContent("c");
        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }
}
