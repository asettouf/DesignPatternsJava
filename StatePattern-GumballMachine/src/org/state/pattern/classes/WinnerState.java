package org.state.pattern.classes;

import java.util.Random;

import org.state.pattern.abstracts.State;

public class WinnerState extends soldState implements State {	
	public WinnerState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}


	@Override
	public void dispense() {
		super.dispense();
		Random rand = new Random();
		int randomNum = rand.nextInt(10 + 1) ;
		if (randomNum == 10 && 
			this.gumballMachine.getCount() > 0) {
			System.out.println("Lucky you");
			super.dispense();
		}
	}

	

}
