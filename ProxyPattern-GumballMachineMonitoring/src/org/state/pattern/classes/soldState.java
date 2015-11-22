package org.state.pattern.classes;

import org.state.pattern.abstracts.State;

public class soldState implements State {
	transient GumballMachine gumballMachine;
	
	public soldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we are already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		this.gumballMachine.releaseBall();
		if (this.gumballMachine.getCount() <= 0){
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
			System.out.println("Out of gumballs");
		}else {
			this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
		}
	}

}
