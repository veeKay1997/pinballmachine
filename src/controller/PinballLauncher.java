package controller;

import model.PinballMachine;
import state.OneBallState;

public class PinballLauncher {

    public static void main(String[] args) {
        PinballMachine pinballMachine = new PinballMachine();
        pinballMachine.onBumper();
        pinballMachine.onGoal();
        pinballMachine.onBumper();
        pinballMachine.onLoseBall();
        pinballMachine.onGoal();
        pinballMachine.onGoal();
        pinballMachine.onBumper();
        pinballMachine.onBumper();
        pinballMachine.onLoseBall();
        pinballMachine.onLoseBall();
        pinballMachine.onLoseBall();

    }

}
