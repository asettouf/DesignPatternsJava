package org.state.pattern.classes;

import java.util.Random;

import org.state.pattern.abstracts.State;

public class WinnerState implements State {
protected GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
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
		System.out.println("Sending gumball");
		Random rand = new Random();
		int randomNum = rand.nextInt(10 - 0 + 1) ;
		this.gumballMachine.setState(this.gumballMachine.getSoldState());
		this.gumballMachine.getSoldState().dispense();
		if (randomNum == 10) {
			System.out.println("Lucky you win");
			this.gumballMachine.getSoldState().dispense();
		}
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
