package org.name.pattern.classes;

import org.name.pattern.abstracts.Screen;

public class ScreenImp implements Screen {
	protected String name;
	
	public ScreenImp() {
		this.name="Screen";
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
	public void down() {
		System.out.println(this.name + " is down");
	}

	@Override
	public void up() {
		System.out.println(this.name + " is up");
	}

}
