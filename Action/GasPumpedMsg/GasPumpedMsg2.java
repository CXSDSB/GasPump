package Action.GasPumpedMsg;

import Data.Data;
import Data.DataGasPump2;

public class GasPumpedMsg2 extends GasPumpedMsg {

    public GasPumpedMsg2(Data data) {
        super(data);
    }
    @Override
    public void gasPumpedMsg() {
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println(d.L + " liter of " + d.gasType + "gas has pumped");
        System.out.println("Select 8 to continue pumping");
        System.out.println("Select S to stopPump");
    }
}
