package Action.ReadyMsg;

import Data.Data;

public abstract class ReadyMsg {
    Data data;

    public ReadyMsg(Data data) {
        this.data = data;
    }

    public abstract void readyMsg();
}
