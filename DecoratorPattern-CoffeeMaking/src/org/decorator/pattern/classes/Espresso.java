package org.decorator.pattern.classes;

import org.decorator.pattern.abstracts.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		this.desc = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
