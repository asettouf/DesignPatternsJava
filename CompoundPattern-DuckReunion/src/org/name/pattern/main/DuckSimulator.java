package org.name.pattern.main;

import org.name.pattern.abstracts.AbstractDuckFactory;
import org.name.pattern.abstracts.Quackable;
import org.name.pattern.classes.CountingDuckFactory;
import org.name.pattern.classes.Goose;
import org.name.pattern.classes.GooseAdapter;
import org.name.pattern.classes.QuackCounter;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate(duckFactory);
	}
	
	public void simulate(AbstractDuckFactory duckFactory){
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Goose goose = new Goose();
		Quackable gooseDuck = new GooseAdapter(goose);
		
		System.out.println("Duck Simulator");
		
		this.simulate(mallardDuck);
		this.simulate(redheadDuck);
		this.simulate(duckCall);
		this.simulate(rubberDuck);
		this.simulate(gooseDuck);
		
		System.out.println("Ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	public void simulate (Quackable duck){
		duck.quack();
	}

}
