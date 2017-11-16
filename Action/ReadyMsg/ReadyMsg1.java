package Action.ReadyMsg;

import Data.Data;
import Data.DataGasPump1;

public class ReadyMsg1 extends ReadyMsg {

    public ReadyMsg1(Data data) {
        super(data);
    }

    @Override
    public void readyMsg() {
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println("Enter 9 for 1 gallon of " + d.gasType + " gas.");
        System.out.println("Select S to StopPump.");
    }
}
