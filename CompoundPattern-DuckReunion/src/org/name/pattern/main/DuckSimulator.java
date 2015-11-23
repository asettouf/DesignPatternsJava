package org.name.pattern.main;

import org.name.pattern.abstracts.AbstractDuckFactory;
import org.name.pattern.abstracts.AbstractGooseFactory;
import org.name.pattern.abstracts.Quackable;
import org.name.pattern.classes.CountingDuckFactory;
import org.name.pattern.classes.Flock;
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
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Goose goose = gooseFactory.createGoose();
		Quackable gooseDuck = gooseFactory.createGooseAdapter(goose);
		
		System.out.println("Duck Simulator");
		
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Quackable mallrdOne = duckFactory.createMallardDuck();
		Quackable mallrdTwo = duckFactory.createMallardDuck();
		Quackable mallrdThree = duckFactory.createMallardDuck();
		Quackable mallrdFour = duckFactory.createMallardDuck();
		
		Flock flockOfMallards = new Flock();
		flockOfMallards.add(mallrdOne);
		flockOfMallards.add(mallrdTwo);
		flockOfMallards.add(mallrdThree);
		flockOfMallards.add(mallrdFour);
		
		flockOfDucks.add(flockOfMallards);
		
		this.simulate(flockOfDucks);
		this.simulate(flockOfMallards);
		
		System.out.println("Ducks quacked " + QuackCounter.getQuacks() + " times");
	}
	
	public void simulate (Quackable duck){
		duck.quack();
	}

}
