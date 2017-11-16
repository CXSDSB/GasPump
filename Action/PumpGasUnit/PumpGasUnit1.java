package Action.PumpGasUnit;

import Data.Data;
import Data.DataGasPump1;

public class PumpGasUnit1 extends PumpGasUnit {

    public PumpGasUnit1(Data data) {
        super(data);
    }
    @Override
    public void pumpGasUnit() {
        DataGasPump1 d = (DataGasPump1) data;
        /*
            Call the subroutine that ACTUALLY pumps gas here
            Now increment the appropriate data values
        */
        d.G++;
        d.total = d.price * d.G;
    }
}
