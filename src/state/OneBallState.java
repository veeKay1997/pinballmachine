package state;

import model.PinballMachine;

public class OneBallState implements PinballMachineState {

    private PinballMachine pinballMachine;

    public OneBallState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    @Override
    public void onGoal() {
        System.out.println("extra ball");
        this.pinballMachine.changeState(new TwoBallState(this.pinballMachine));
    }

    @Override
    public void onBumper() {
        this.pinballMachine.updateScore(20);
        System.out.println("score = " + 20);
    }

    @Override
    public void onLoseBall() {
        System.out.println("Game over with score: " + this.pinballMachine.totalscore);
    }
}
