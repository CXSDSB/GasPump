package AbstractPump;

import InputProcessor.IPGasPump1;
import InputProcessor.InputProcessor;
import Model.EFSM.StateModel;
import Action.CancelMsg.CancelMsg1;
import Action.DisplayMenu.DisplayMenu1;
import Action.GasPumpedMsg.GasPumpedMsg1;
import Action.PayMsg.PayMsg1;
import Action.PrintReceipt.PrintReceipt1;
import Action.PumpGasUnit.PumpGasUnit1;
import Action.ReadyMsg.ReadyMsg1;
import Action.RejectMsg.RejectMsg1;
import Action.ReturnCash.ReturnCash1;
import Action.SetInitialValues.SetInitialValues1;
import Action.SetPrice.SetPrice1;
import Action.StopMsg.StopMsg1;
import Action.StoreCash.StoreCash1;
import Action.StoreData.StoreData1;
import Model.OutputProcessor.OutputProcessor;
import Data.Data;
import Data.DataGasPump1;


/*
    Factory that produces the necessary function calls for GasPump1
*/
public class ConcretePump1 extends AbstractPump {
    private DataGasPump1 data;
    private IPGasPump1 ip;
    private StateModel model;
    private OutputProcessor op;

    public ConcretePump1() {
        // create the 4 core objects that a GasPump needs
        data  = new DataGasPump1();
        ip    = new IPGasPump1();
        model = new StateModel();
        op    = new OutputProcessor();

        // InputProcessor and OutputProcessor share the same data structure
        ip.setData(data);
        op.setData(data);

        // set the InputProcessor's model object reference
        ip.setModel(model);

        // set the OutputProcessor's action strategies to GasPump1 specific actions
        // and also pass in the shared Data structure to actions that need it
        op.setCancelMsg         (new CancelMsg1());
        op.setDisplayMenu       (new DisplayMenu1(data));
        op.setGasPumpedMsg      (new GasPumpedMsg1(data));
        op.setPayMsg            (new PayMsg1());
        op.setPrintReceipt      (new PrintReceipt1(data));
        op.setPumpGasUnit       (new PumpGasUnit1(data));
        op.setReadyMsg          (new ReadyMsg1(data));
        op.setRejectMsg         (new RejectMsg1());
        op.setReturnCash        (new ReturnCash1());
        op.setSetInitialValues  (new SetInitialValues1(data));
        op.setSetPrice          (new SetPrice1(data));
        op.setStopMsg           (new StopMsg1());
        op.setStoreCash         (new StoreCash1());
        op.setStoreData         (new StoreData1(data));

        // set the EFSM model's OutputProcessor's object reference
        model.setOP(op);
    }

    @Override
    public Data getDataObj() {
        return this.data;
    }

    @Override
    public InputProcessor getInputProcessor() {
        return this.ip;
    }

    @Override
    public StateModel getStateMachine() {
        return this.model;
    }

    @Override
    public OutputProcessor getOutputProcessor() {
        return this.op;
    }
}
