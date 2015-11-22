package org.state.pattern.classes;

import org.state.pattern.abstracts.State;

public class hasQuarterState implements State {
	transient GumballMachine gumballMachine;
	
	public hasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Returning Quarter");
		this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		this.gumballMachine.setState(this.gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
