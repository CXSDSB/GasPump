package Model.EFSM;

class S0 extends State {

    S0(StateModel model) {
        super(model);
    }

    @Override
    void start() {
        if (model.s == model.LS[0]) {
            model.s = model.LS[1];
            model.getOP().PayMsg();
        }
    }
}
