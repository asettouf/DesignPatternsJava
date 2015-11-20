package org.adapter.pattern.classes;

import org.adapter.pattern.abstracts.Turkey;

public class WildTurkey implements Turkey {

	public WildTurkey() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
