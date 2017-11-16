package AbstractPump;

import InputProcessor.IPGasPump2;
import InputProcessor.InputProcessor;
import Model.EFSM.StateModel;
import Action.CancelMsg.CancelMsg2;
import Action.DisplayMenu.DisplayMenu2;
import Action.GasPumpedMsg.GasPumpedMsg2;
import Action.PayMsg.PayMsg2;
import Action.PrintReceipt.PrintReceipt2;
import Action.PumpGasUnit.PumpGasUnit2;
import Action.ReadyMsg.ReadyMsg2;
import Action.RejectMsg.RejectMsg2;
import Action.ReturnCash.ReturnCash2;
import Action.SetInitialValues.SetInitialValues2;
import Action.SetPrice.SetPrice2;
import Action.StopMsg.StopMsg2;
import Action.StoreCash.StoreCash2;
import Action.StoreData.StoreData2;
import Model.OutputProcessor.OutputProcessor;
import Data.Data;
import Data.DataGasPump2;

/*
    Factory that produces the necessary driver objects for GasPump2
*/
public class ConcretePump2 extends AbstractPump {
    private DataGasPump2 data;
    private IPGasPump2 ip;
    private StateModel model;
    private OutputProcessor op;
    public ConcretePump2() {
        // create the 4 core objects that a GasPump needs
        data  = new DataGasPump2();
        ip    = new IPGasPump2();
        model = new StateModel();
        op    = new OutputProcessor();

        // InputProcessor and OutputProcessor share the same data structure
        ip.setData(data);
        op.setData(data);

        // set the InputProcessor's model object reference
        ip.setModel(model);

        // set the OutputProcessor's action strategies to GasPump2 specific actions
        op.setCancelMsg         (new CancelMsg2());
        op.setDisplayMenu       (new DisplayMenu2(data));
        op.setGasPumpedMsg      (new GasPumpedMsg2(data));
        op.setPayMsg            (new PayMsg2());
        op.setPrintReceipt      (new PrintReceipt2(data));
        op.setPumpGasUnit       (new PumpGasUnit2(data));
        op.setReadyMsg          (new ReadyMsg2(data));
        op.setRejectMsg         (new RejectMsg2());
        op.setReturnCash        (new ReturnCash2(data));
        op.setSetInitialValues  (new SetInitialValues2(data));
        op.setSetPrice          (new SetPrice2(data));
        op.setStopMsg           (new StopMsg2());
        op.setStoreCash         (new StoreCash2(data));
        op.setStoreData         (new StoreData2(data));

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
