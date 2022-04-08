package state;

import model.PinballMachine;

public class ThreeBallState implements PinballMachineState{

    private PinballMachine pinballMachine;

    public ThreeBallState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    @Override
    public void onGoal() {
    }

    @Override
    public void onBumper() {
        this.pinballMachine.updateScore(80);
        System.out.println("score = " + 80);
    }

    @Override
    public void onLoseBall() {
        System.out.println("lose ball");
        this.pinballMachine.changeState(new TwoBallState(this.pinballMachine));
    }
}
