package Action.ReturnCash;

import Data.Data;
import Data.DataGasPump2;

public class ReturnCash2 extends ReturnCash {

    public ReturnCash2(Data data) {
        super(data);
    }

    @Override
    public void returnCash() {
        DataGasPump2 d = (DataGasPump2) data;
        float cash_return = d.cash - d.total;
        if (cash_return >= 0) {
        	System.out.println("Cash Remaining: $" + cash_return);
        } 
        else System.out.println("No cash return.");
        System.out.println("Cash has been returned.");
    }
}
