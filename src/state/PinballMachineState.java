package state;

public interface PinballMachineState {

    void onGoal();
    void onBumper();
    void onLoseBall();

}
