package Action.SetInitialValues;

import Data.Data;
import Data.DataGasPump2;

public class SetInitialValues2 extends SetInitialValues {

    public SetInitialValues2(Data data) {
        super(data);
    }

    @Override
    public void setInitialValues() {
        DataGasPump2 d = (DataGasPump2) data;
        d.L = 0;
        d.total = 0;
    }
}
