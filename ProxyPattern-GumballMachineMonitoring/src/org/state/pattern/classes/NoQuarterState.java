package org.state.pattern.classes;

import org.state.pattern.abstracts.State;

public class NoQuarterState implements State {
	transient GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned the crank, but you inserted no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("Pay first");
	}

}
