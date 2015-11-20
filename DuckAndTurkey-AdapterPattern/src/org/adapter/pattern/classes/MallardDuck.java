package org.adapter.pattern.classes;

import org.adapter.pattern.abstracts.Duck;

public class MallardDuck implements Duck {

	public MallardDuck() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void quack() {
		System.out.println("Quack");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
