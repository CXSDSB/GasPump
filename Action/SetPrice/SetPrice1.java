package Action.SetPrice;

import Data.Data;
import Data.DataGasPump1;

public class SetPrice1 extends SetPrice {

    public SetPrice1(Data data) {
        super(data);
    }

    @Override
    public void setPrice(int g) {
        DataGasPump1 d = (DataGasPump1) data;
        if (g == 1) { // Regular selected
            d.price = d.R_price;
            d.gasType = "Regular";
        } else if (g == 2) { // Super selected
            d.price = d.S_price;
            d.gasType = "Super";
        }
        System.out.println("Type " + d.gasType + " Selected");
        System.out.println("Price of " + d.gasType + "is: $"+ d.price + "/gallon");
        System.out.println("Select 8 to StartPump");
    }
}
