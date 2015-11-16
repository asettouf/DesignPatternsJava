package org.decorator.pattern.classes;

import org.decorator.pattern.abstracts.Beverage;
import org.decorator.pattern.abstracts.CondimentDecorator;

public class Whip extends CondimentDecorator {
	
	private Beverage bev;
	
	public Whip(Beverage bev) {
		this.bev = bev;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDesc() {
		return this.bev.getDesc() + ", with Whip";
	}

	@Override
	public double cost() {
		return 0.2 + this.bev.cost()	;
	}

}
