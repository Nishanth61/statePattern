package com.example.state;

/**
 * 
 * Land state of Flying Machine
 *
 */
public class LandFlyingMachineState implements FlyingMachineState {

	private FlyingMachine flyingMachine;

	public LandFlyingMachineState(FlyingMachine flyingMachine) {
		this.flyingMachine = flyingMachine;
	}

	@Override
	public void startFlyingMachine() {
		System.out.println("Cannot Start, as flyingMachine Process is already in Land state");

	}

	@Override
	public void takeOffFlyingMachine() {
		System.out.println("Cannot Take Off, as flyingMachine Process is already in take off state");

	}

	@Override
	public void landFlyingMachine() {
		System.out.println("Take Off FlyingMachine");
		flyingMachine.setState(flyingMachine.stopFlyingMachineState);

	}

	@Override
	public void stopFlyingMachine() {
		System.out.println("Cannot Stop, as flyingMachine Process is Landing State");

	}

}
