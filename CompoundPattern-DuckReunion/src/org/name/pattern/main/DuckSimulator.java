package org.name.pattern.main;

import org.name.pattern.abstracts.AbstractDuckFactory;
import org.name.pattern.abstracts.AbstractGooseFactory;
import org.name.pattern.abstracts.Quackable;
import org.name.pattern.classes.CountingDuckFactory;
import org.name.pattern.classes.Goose;
import org.name.pattern.classes.GooseFactory;
import org.name.pattern.classes.QuackCounter;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		AbstractGooseFactory gooseFactory = new GooseFactory();
		simulator.simulate(duckFactory, gooseFactory);
	}
	
	public void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory){
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Goose goose = gooseFactory.createGoose();
		Quackable gooseDuck = gooseFactory.createGooseAdapter(goose);
		
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
