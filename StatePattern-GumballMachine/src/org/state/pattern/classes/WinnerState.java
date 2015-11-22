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
		Random rand = new Random(System.currentTimeMillis());
		int randomWin = rand.nextInt(10) ;
		if (randomWin == 0 && 
			this.gumballMachine.getCount() > 0) {
			System.out.println("Lucky you");
			super.dispense();
		}
	}

}
