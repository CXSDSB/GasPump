package Model.EFSM;

import Model.OutputProcessor.OutputProcessor;

/*
    This class is the VM class in the De-centralized State design pattern.
    it is used by executing Actions and State transitions.
*/

public class StateModel {
    protected State s;
    protected State[] LS;
    private OutputProcessor op;

    public StateModel() {
        LS = new State[8];
        LS[7] = new InitState(this);
        LS[0] = new S0(this);
        LS[1] = new S1(this);
        LS[2] = new S2(this);
        LS[3] = new S3(this);
        LS[4] = new S4(this);
        LS[5] = new S5(this);
        LS[6] = new S6(this);
        s = LS[7]; // set state to InitState
    }
    /*
        Getters and Setters
    */

    public OutputProcessor getOP() {
        return op;
    }

    public void setOP(OutputProcessor op) {
        this.op = op;
    }

    /*
        State operations
    */

    public void activate() {
        s.activate();
    }

    public void start() {
        s.start();
    }

    /*
        credit: t=1
        cash:   t=2
     */
    public void payType(int t) {
        s.payType(t);
    }

    public void approve() {
        s.approve();
    }

    public void reject() {
        s.reject();
    }

    public void cancel() {
        s.cancel();
    }

    /*
    Regular:    g=1
    Super:      g=2
    Premium:    g=3
 */
    public void selectGas(int g) {
        s.selectGas(g);
    }

    public void startPump() {
        s.startPump();
    }

    public void pump() {
        s.pump();
    }

    public void stopPump() {
        s.stopPump();
    }

    public void receipt() {
        s.receipt();
    }

    public void noReceipt() {
        s.noReceipt();
    }


}
