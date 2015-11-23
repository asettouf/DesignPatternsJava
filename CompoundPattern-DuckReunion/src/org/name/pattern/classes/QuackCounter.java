package org.name.pattern.classes;

import org.name.pattern.abstracts.Quackable;

public class QuackCounter implements Quackable {
	protected Quackable duck;
	private static int numberOfQuacks = 0;
	
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}


	@Override
	public void quack() {
		this.duck.quack();
		numberOfQuacks++;
	}
	
	public static int getQuacks(){
		return numberOfQuacks;
	}

}
