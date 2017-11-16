package Model.OutputProcessor;

import Action.PayMsg.PayMsg;
import Action.PumpGasUnit.PumpGasUnit;
import Action.StopMsg.StopMsg;
import Action.StoreCash.StoreCash;
import Action.CancelMsg.CancelMsg;
import Action.DisplayMenu.DisplayMenu;
import Action.GasPumpedMsg.GasPumpedMsg;
import Action.PrintReceipt.PrintReceipt;
import Action.ReadyMsg.ReadyMsg;
import Action.RejectMsg.RejectMsg;
import Action.ReturnCash.ReturnCash;
import Action.SetInitialValues.SetInitialValues;
import Action.SetPrice.SetPrice;
import Action.StoreData.StoreData;
import Data.Data;

/*
    This class is the abstract superclass of Strategy pattern
    This OutputProcessor calls each action of corresponding state status for executing user's input command.
*/
public class OutputProcessor {
    private Data data;
    private CancelMsg cancelMsg;
    private DisplayMenu displayMenu;
    private GasPumpedMsg gasPumpedMsg;
    private PayMsg payMsg;
    private PrintReceipt printReceipt;
    private PumpGasUnit pumpGasUnit;
    private ReadyMsg readyMsg;
    private RejectMsg rejectMsg;
    private ReturnCash returnCash;
    private SetInitialValues setInitialValues;
    private SetPrice setPrice;
    private StopMsg stopMsg;
    private StoreCash storeCash;
    private StoreData storeData;

    public OutputProcessor() {
    }

    /*
        Meta-actions (implementation of Strategy pattern)
    */

    public void CancelMsg() {
        this.cancelMsg.cancelMsg();
    }

    public void DisplayMenu() {
        this.displayMenu.displayMenu();
    }

    public void GasPumpedMsg() {
        this.gasPumpedMsg.gasPumpedMsg();
    }

    public void PayMsg() {
        this.payMsg.payMsg();
    }

    public void PrintReceipt() {
        this.printReceipt.printReceipt();
    }

    public void PumpGasUnit() {
        this.pumpGasUnit.pumpGasUnit();
    }

    public void ReadyMsg() {
        this.readyMsg.readyMsg();
    }

    public void RejectMsg() {
        this.rejectMsg.rejectMsg();
    }

    public void ReturnCash() {
        this.returnCash.returnCash();
    }

    public void SetInitialValues() {
        this.setInitialValues.setInitialValues();
    }

    public void SetPrice(int g) {
        this.setPrice.setPrice(g);
    }

    public void StopMsg() {
        this.stopMsg.stopMsg();
    }

    public void StoreCash() {
        this.storeCash.storeCash();
    }

    public void StoreData() {
        this.storeData.storeData();
    }



    /*
        GETTERS AND SETTERS
    */


    public Data getData() {
        return data;
    }

    public void setCancelMsg(CancelMsg cancelMsg) {
        this.cancelMsg = cancelMsg;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setDisplayMenu(DisplayMenu displayMenu) {
        this.displayMenu = displayMenu;
    }

    public void setGasPumpedMsg(GasPumpedMsg gasPumpedMsg) {
        this.gasPumpedMsg = gasPumpedMsg;
    }

    public void setPayMsg(PayMsg payMsg) {
        this.payMsg = payMsg;
    }

    public void setPrintReceipt(PrintReceipt printReceipt) {
        this.printReceipt = printReceipt;
    }

    public void setPumpGasUnit(PumpGasUnit pumpGasUnit) {
        this.pumpGasUnit = pumpGasUnit;
    }

    public void setReadyMsg(ReadyMsg readyMsg) {
        this.readyMsg = readyMsg;
    }

    public void setRejectMsg(RejectMsg rejectMsg) {
        this.rejectMsg = rejectMsg;
    }

    public void setReturnCash(ReturnCash returnCash) {
        this.returnCash = returnCash;
    }

    public void setSetInitialValues(SetInitialValues setInitialValues) {
        this.setInitialValues = setInitialValues;
    }

    public void setSetPrice(SetPrice setPrice) {
        this.setPrice = setPrice;
    }

    public void setStopMsg(StopMsg stopMsg) {
        this.stopMsg = stopMsg;
    }

    public void setStoreCash(StoreCash storeCash) {
        this.storeCash = storeCash;
    }

    public void setStoreData(StoreData storeData) {
        this.storeData = storeData;
    }

}
