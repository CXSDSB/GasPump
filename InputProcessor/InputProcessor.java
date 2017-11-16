package InputProcessor;

import Model.EFSM.StateModel;
import Data.Data;

/*
    This class groups all input objects and data structures under 1 abstract superclass
*/
public abstract class InputProcessor {
    Data data;
    StateModel model;

    public InputProcessor() {
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public StateModel getModel() {
        return model;
    }

    public void setModel(StateModel model) {
        this.model = model;
    }


}
