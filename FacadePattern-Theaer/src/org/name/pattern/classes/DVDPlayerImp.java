package org.name.pattern.classes;

import org.name.pattern.abstracts.DvdPlayer;

public class DVDPlayerImp implements DvdPlayer {
	private String name;
	
	public DVDPlayerImp() {
		this.setName("DVDPlayer");
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
	public void play(String movie) {
		System.out.println(this.name + " is playing " + movie);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void stop() {
		System.out.println(this.name + " is stopped");
		
	}
	@Override
	public void eject() {
		System.out.println(this.name + " has ejected the movie");
		
	}

}
