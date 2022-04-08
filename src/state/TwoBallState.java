package state;

import model.PinballMachine;

public class TwoBallState implements PinballMachineState {

    private PinballMachine pinballMachine;

    public TwoBallState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    @Override
    public void onGoal() {
        System.out.println("extra ball");
        this.pinballMachine.changeState(new ThreeBallState(this.pinballMachine));
    }

    @Override
    public void onBumper() {
        this.pinballMachine.updateScore(40);
        System.out.println("score = " + 40);
    }

    @Override
    public void onLoseBall() {
        System.out.println("lose ball");
        this.pinballMachine.changeState(new OneBallState(this.pinballMachine));
    }
}
