package org.state.pattern.classes;

import org.state.pattern.abstracts.State;

public class soldOutState implements State {
	protected GumballMachine gumballMachine;
	
	
	public soldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter, machine is empy");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject quarter,none was inserted");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there are no gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
