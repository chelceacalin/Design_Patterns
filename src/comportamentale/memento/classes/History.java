package comportamentale.memento.classes;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> stateList=new ArrayList<>();

    public void push(EditorState state){
        stateList.add(state);
    }
    public EditorState pop(){
        var lastIndex=stateList.size()-1;
        var lastState=stateList.get(lastIndex);
        stateList.remove(lastState);
        return lastState;
    }
}
