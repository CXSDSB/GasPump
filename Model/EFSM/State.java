package Model.EFSM;

/*
    This class is the abstract superclass of De-centralized State Pattern.
*/

public abstract class State {
    StateModel model;

    public State(StateModel model) {
        this.model = model;
    }

    void activate()         {notAllowed();}
    void start()            {notAllowed();}

    /*
        credit: t=1
        cash:   t=2
     */
    void payType(int t)     {notAllowed();}
    void approve()          {notAllowed();}
    void reject()           {notAllowed();}
    /*
    Regular:    g=1
    Super:      g=2
    Premium:    g=3
 */
    void selectGas(int g)   {notAllowed();}
    void cancel()           {notAllowed();}
    void startPump()        {notAllowed();}
    void pump()             {notAllowed();}
    void stopPump()         {notAllowed();}
    void receipt()          {notAllowed();}
    void noReceipt()        {notAllowed();}

    private void notAllowed() {
        System.out.println("OPERATION NOT ALLOWED IN THIS STATE");
    }
}
