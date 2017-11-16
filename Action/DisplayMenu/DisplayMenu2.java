package Action.DisplayMenu;

import Data.Data;
import Data.DataGasPump2;

public class DisplayMenu2 extends DisplayMenu {

    public DisplayMenu2(Data data) {
        super(data);
    }

    @Override
    public void displayMenu() {
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println("Please select gas type: ");
        System.out.println("3. Regular: $" + d.R_price + "/liter");
        System.out.println("4. Super: $" + d.S_price + "/liter");
        System.out.println("5. Premium: $" + d.P_price + "/liter");
        System.out.println("Select 6 to Cancel");
    }
}
