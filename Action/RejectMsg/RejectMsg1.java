package Action.RejectMsg;

public class RejectMsg1 extends RejectMsg {
    @Override
    public void rejectMsg() {
        System.out.println("Credit card rejected.");
        System.out.println("Select 1 to restart.");
    }
}
