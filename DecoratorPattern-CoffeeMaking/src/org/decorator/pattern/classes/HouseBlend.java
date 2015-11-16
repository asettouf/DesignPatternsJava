package org.decorator.pattern.classes;

import org.decorator.pattern.abstracts.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.desc = "House Blend Coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}

}
