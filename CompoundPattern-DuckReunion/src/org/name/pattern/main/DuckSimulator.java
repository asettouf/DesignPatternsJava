package org.name.pattern.main;

import org.name.pattern.abstracts.Quackable;
import org.name.pattern.classes.DuckCall;
import org.name.pattern.classes.MallardDuck;
import org.name.pattern.classes.RedheadDuck;
import org.name.pattern.classes.RubberDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
	
	public void simulate(){
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		
		System.out.println("Duck Simulator");
		
		this.simulate(mallardDuck);
		this.simulate(redheadDuck);
		this.simulate(duckCall);
		this.simulate(rubberDuck);
	}
	
	public void simulate (Quackable duck){
		duck.quack();
	}

}
