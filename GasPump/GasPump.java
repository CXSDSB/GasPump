package GasPump;

import AbstractPump.AbstractPump;
import InputProcessor.InputProcessor;

/*
    This abstract superclass implements the client-side of the Abstract Factory design pattern.
    Its constructor is called by GasPump1 and GasPump2 that pass their parameters to the abstract class for function calls.
*/

public abstract class GasPump {
    private InputProcessor ip;


    public GasPump(AbstractPump af) {
        this.ip = af.getInputProcessor();
    }

    public abstract void printOperations();


    /*
        GETTERS AND SETTERS
    */

    public InputProcessor getIP() {
        return ip;
    }

    public void setIP(InputProcessor ip) {
        this.ip = ip;
    }

}
