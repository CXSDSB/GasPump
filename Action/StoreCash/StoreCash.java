package Action.StoreCash;

import Data.Data;

public abstract class StoreCash {
    Data data;

    public StoreCash() {
    }

    public StoreCash(Data  data) {
        this.data = data;
    }

    public abstract void storeCash();
}
