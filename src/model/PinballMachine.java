package model;

import state.OneBallState;
import state.PinballMachineState;

public class PinballMachine {

    private PinballMachineState state;

    public int totalscore;

    public PinballMachine() {
       this.totalscore = 0;
       this.state = new OneBallState(this);
    }

    public void changeState(PinballMachineState state){
        this.state = state;
    }

    public void updateScore(int score){
        totalscore += score;
    }

    public void onGoal() {
        this.state.onGoal();
    }

    public void onBumper() {
        this.state.onBumper();
    }

    public void onLoseBall() {
        this.state.onLoseBall();
    }
}
