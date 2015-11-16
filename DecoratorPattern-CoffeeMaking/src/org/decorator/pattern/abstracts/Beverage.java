package org.decorator.pattern.abstracts;

public abstract class Beverage {
	public String desc;
	
	public abstract double cost();

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
