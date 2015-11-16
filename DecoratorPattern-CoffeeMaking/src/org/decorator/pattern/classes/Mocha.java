package org.decorator.pattern.classes;

import org.decorator.pattern.abstracts.Beverage;
import org.decorator.pattern.abstracts.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	
	private Beverage bev;
	public Mocha(Beverage bev) {
		this.bev = bev;
		this.desc = this.bev.getDesc() + ", with Mocha";
	}

	@Override
	public String getDesc() {
		return this.bev.getDesc() + ", with Mocha";
	}

	@Override
	public double cost() {
		return 0.2 + this.bev.cost()	;
	}

}
