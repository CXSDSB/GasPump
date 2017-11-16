package Action.PrintReceipt;

import Data.Data;
import Data.DataGasPump1;

public class PrintReceipt1 extends PrintReceipt {

    public PrintReceipt1(Data data) {
        super(data);
    }

    @Override
    public void printReceipt() {
    	System.out.println("\nThank you for your bussiness!");
        System.out.println("-----------------------------------------------------------------------");
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println("Gallons of Gas: " + d.G);
        System.out.println("Type of Gas: " + d.gasType);
        System.out.println("Price of Gas: " + d.price + "/gallon");
        System.out.println("Total Amount: $" + d.total);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Have a nice day!\n");
        System.out.println("Select Q to exit.");
    }
}
