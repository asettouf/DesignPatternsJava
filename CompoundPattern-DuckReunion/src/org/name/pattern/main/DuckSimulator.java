package org.name.pattern.main;

import org.name.pattern.abstracts.Quackable;
import org.name.pattern.classes.DuckCall;
import org.name.pattern.classes.Goose;
import org.name.pattern.classes.GooseAdapter;
import org.name.pattern.classes.MallardDuck;
import org.name.pattern.classes.QuackCounter;
import org.name.pattern.classes.RedheadDuck;
import org.name.pattern.classes.RubberDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
	
	public void simulate(){
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
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
