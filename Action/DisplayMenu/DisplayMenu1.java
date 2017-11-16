package Action.DisplayMenu;

import Data.Data;
import Data.DataGasPump1;

public class DisplayMenu1 extends DisplayMenu {

    public DisplayMenu1(Data data) {
        super(data);
    }

    @Override
    public void displayMenu() {
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println("Credit card Approved.");
        System.out.println("Please select gas type:");
        System.out.println("5. Regular: $" + d.R_price + "/gal");
        System.out.println("6. Super: $" + d.S_price + "/gal");
        System.out.println("Select 7 to cancel.");
    }
}
