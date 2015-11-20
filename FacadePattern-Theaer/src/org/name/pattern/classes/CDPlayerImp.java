package org.name.pattern.classes;

import org.name.pattern.abstracts.CDPlayer;

public class CDPlayerImp implements CDPlayer {
	protected String name;
	
	public CDPlayerImp() {
		this.name="CDPlayer";
	}
	@Override
	public void on() {
		System.out.println(this.name + " is on");

	}

	@Override
	public void off() {
		System.out.println(this.name + " is off");
	}

}
