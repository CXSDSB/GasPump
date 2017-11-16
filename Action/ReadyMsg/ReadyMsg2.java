package Action.ReadyMsg;

import Data.Data;
import Data.DataGasPump2;

public class ReadyMsg2 extends ReadyMsg {

    public ReadyMsg2(Data data) {
        super(data);
    }

    @Override
    public void readyMsg() {
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println("Enter 8 for 1 liter of " + d.gasType + " gas.");
        System.out.println("Select S to StopPump.");
    }
}
