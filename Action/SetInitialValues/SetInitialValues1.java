package Action.SetInitialValues;

import Data.Data;
import Data.DataGasPump1;

public class SetInitialValues1 extends SetInitialValues {

    public SetInitialValues1(Data data) {
        super(data);
    }

    @Override
    public void setInitialValues() {
        DataGasPump1 d = (DataGasPump1) data;
        d.G = 0;
        d.total = 0;
    }
}
