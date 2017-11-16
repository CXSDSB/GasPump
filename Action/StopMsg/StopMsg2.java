package Action.StopMsg;

public class StopMsg2 extends StopMsg {
    @Override
    public void stopMsg() {
        System.out.println("\n**********Pump Stop**********\n");
        System.out.println("Select P for Receipt.");
        System.out.println("Select N for NoReceipt.");
    }
}
