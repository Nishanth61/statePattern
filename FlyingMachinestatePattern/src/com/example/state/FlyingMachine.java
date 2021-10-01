package com.example.state;
/**
 *
 * FlyingMachine
 *
 */
public class FlyingMachine {

	FlyingMachineState startFlyingMachineState;
	FlyingMachineState landFlyingMachineState;
	FlyingMachineState stopFlyingMachineState;
	FlyingMachineState takeOffFlyingMachineState;

	FlyingMachineState state;

	public FlyingMachine() {

		startFlyingMachineState = new StartFlyingMachineState(this);
		takeOffFlyingMachineState = new TakeOffFlyingMachineState(this);
		landFlyingMachineState = new LandFlyingMachineState(this);
		stopFlyingMachineState = new StopFlyingMachineState(this);
		
		//start state
		this.state = startFlyingMachineState;

	}

	public void startFlyingMachine() {
		state.startFlyingMachine();
	}

	public void takeOffFlyingMachine() {
		state.takeOffFlyingMachine();
	}

	public void landFlyingMachine() {
		state.landFlyingMachine();
	}

	public void stopFlyingMachine() {
		state.stopFlyingMachine();
	}

	public FlyingMachineState getStartFlyingMachineState() {
		return startFlyingMachineState;
	}

	public void setStartFlyingMachineState(FlyingMachineState startFlyingMachineState) {
		this.startFlyingMachineState = startFlyingMachineState;
	}

	public FlyingMachineState getLandFlyingMachineState() {
		return landFlyingMachineState;
	}

	public void setLandFlyingMachineState(FlyingMachineState landFlyingMachineState) {
		this.landFlyingMachineState = landFlyingMachineState;
	}

	public FlyingMachineState getStopFlyingMachineState() {
		return stopFlyingMachineState;
	}

	public void setStopFlyingMachineState(FlyingMachineState stopFlyingMachineState) {
		this.stopFlyingMachineState = stopFlyingMachineState;
	}

	public FlyingMachineState getTakeOffFlyingMachineState() {
		return takeOffFlyingMachineState;
	}

	public void setTakeOffFlyingMachineState(FlyingMachineState takeOffFlyingMachineState) {
		this.takeOffFlyingMachineState = takeOffFlyingMachineState;
	}

	public FlyingMachineState getState() {
		return state;
	}

	public void setState(FlyingMachineState state) {
		this.state = state;
	}

	

}
