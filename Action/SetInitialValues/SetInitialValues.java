package Action.SetInitialValues;

import Data.Data;

public abstract class SetInitialValues {
    Data data;

    public SetInitialValues(Data data) {
        this.data = data;
    }

    public abstract void setInitialValues();
}
