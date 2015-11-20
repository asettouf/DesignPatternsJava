package org.name.pattern.classes;

import org.name.pattern.abstracts.Projector;

public class ProjectorImp implements Projector {
	protected String name;
	
	public ProjectorImp() {
		this.name="Projector";
	}
	@Override
	public void on() {
		System.out.println(this.name + " is on");
	}

	@Override
	public void off() {
		System.out.println(this.name + " is on");
	}

	@Override
	public void wideScreenMode() {
		System.out.println(this.name + " is oin wide screen mode");
	}

}
