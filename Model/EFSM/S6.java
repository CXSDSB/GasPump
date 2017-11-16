package Model.EFSM;

class S6 extends State {

    S6(StateModel model) {
        super(model);
    }

    @Override
    void receipt() {
        if (model.s == model.LS[6]) {
            model.s = model.LS[0];
            model.getOP().PrintReceipt();
            model.getOP().ReturnCash();
        }
    }

    @Override
    void noReceipt() {
        if (model.s == model.LS[6]) {
            model.s = model.LS[0];
            model.getOP().ReturnCash();
        }
    }
}
