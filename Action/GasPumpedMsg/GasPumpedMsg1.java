package Action.GasPumpedMsg;

import Data.Data;
import Data.DataGasPump1;

public class GasPumpedMsg1 extends GasPumpedMsg {

    public GasPumpedMsg1(Data data) {
        super(data);
    }

    @Override
    public void gasPumpedMsg() {
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println(d.G + " gallon of " + d.gasType + "gas has pumped");
        System.out.println("Select 9 to continue pumping");
        System.out.println("Select S to stopPump");
    }

}
