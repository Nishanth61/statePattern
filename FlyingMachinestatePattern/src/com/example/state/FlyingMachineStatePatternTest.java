package com.example.state;

public class FlyingMachineStatePatternTest {

	public static void main(String[] args) {

		FlyingMachine flyingMachine = new FlyingMachine();

		flyingMachine.startFlyingMachine();
		flyingMachine.takeOffFlyingMachine();
		flyingMachine.landFlyingMachine();
		flyingMachine.stopFlyingMachine();

		flyingMachine.startFlyingMachine();
		flyingMachine.takeOffFlyingMachine();
		flyingMachine.landFlyingMachine();
		flyingMachine.stopFlyingMachine();

		flyingMachine.startFlyingMachine();
		flyingMachine.takeOffFlyingMachine();
		flyingMachine.landFlyingMachine();
		flyingMachine.stopFlyingMachine();

	}

}
