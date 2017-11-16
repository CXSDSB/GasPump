package Action.StoreData;

import Data.Data;

public abstract class StoreData {
    Data data;

    public StoreData(Data data) {
        this.data = data;
    }

    public abstract void storeData();
}
