package Action.PrintReceipt;

import Data.Data;
import Data.DataGasPump2;

public class PrintReceipt2 extends PrintReceipt {

    public PrintReceipt2(Data data) {
        super(data);
    }

    @Override
    public void printReceipt() {
    	System.out.println("\nThank you for your bussiness!");
        System.out.println("-----------------------------------------------------------------------");
        DataGasPump2 d = (DataGasPump2) data;
        System.out.println("liters of Gas: " + d.L);
        System.out.println("Type of Gas: " + d.gasType);
        System.out.println("Price of Gas: " + d.price + "/liter");
        System.out.println("Total Amount: $" + (float) d.total);
        System.out.println("Cash: $" + d.cash);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Have a nice day!\n");
        System.out.println("Select Q to exit.");
    }
}
