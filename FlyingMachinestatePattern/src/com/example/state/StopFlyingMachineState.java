package com.example.state;

/**
 * 
 * Stop Flying Machine State
 *
 */
public class StopFlyingMachineState implements FlyingMachineState {

	private FlyingMachine flyingMachine;

	public StopFlyingMachineState(FlyingMachine flyingMachine) {
		this.flyingMachine = flyingMachine;
	}

	@Override
	public void startFlyingMachine() {
		System.out.println("Cannot Start, as flyingMachine is in Stopping state");

	}

	@Override
	public void takeOffFlyingMachine() {
		System.out.println("Cannot Take off, as flyingMachine Process is stopping state");

	}

	@Override
	public void landFlyingMachine() {
		System.out.println("Cannot Land, as flyingMachine Process is in stopping state");

	}

	@Override
	public void stopFlyingMachine() {
		System.out.println("Stopping FlyingMachine");
		flyingMachine.setState(flyingMachine.startFlyingMachineState);
	}

}
