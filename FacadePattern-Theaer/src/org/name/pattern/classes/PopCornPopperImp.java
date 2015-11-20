package org.name.pattern.classes;

import org.name.pattern.abstracts.PopcornPopper;

public class PopCornPopperImp implements PopcornPopper {
	protected String name;
	
	public PopCornPopperImp() {
		this.name="Pop corn popper";
	}
	@Override
	public void on() {
		System.out.println(this.name + " is on");
	}

	@Override
	public void off() {
		System.out.println(this.name + " is off");
	}

	@Override
	public void pop() {
		System.out.println(this.name + " is popping");
	}

}
