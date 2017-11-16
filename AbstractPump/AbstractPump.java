package AbstractPump;

import Data.Data;
import InputProcessor.InputProcessor;
import Model.EFSM.StateModel;
import Model.OutputProcessor.OutputProcessor;

/*
    This class is the abstract factory class of two gas pumps.
    It defines the method that returns specific gas pump components.
*/
public abstract class AbstractPump {

    public abstract Data getDataObj();

    public abstract InputProcessor getInputProcessor();

    public abstract StateModel getStateMachine();

    public abstract OutputProcessor getOutputProcessor();

}