package org.name.pattern.classes;

import org.name.pattern.abstracts.Amplifier;
import org.name.pattern.abstracts.CDPlayer;
import org.name.pattern.abstracts.DvdPlayer;
import org.name.pattern.abstracts.PopcornPopper;
import org.name.pattern.abstracts.Projector;
import org.name.pattern.abstracts.Screen;
import org.name.pattern.abstracts.Tuner;
import org.name.pattern.abstracts.TheaterLights;

public class HomeTheater {
	protected Amplifier amp;
	protected Tuner tuner;
	protected DvdPlayer dvd;
	protected CDPlayer cd;
	protected Projector projector;
	protected TheaterLights lights;
	protected Screen screen;
	protected PopcornPopper popper;
	
	public HomeTheater(Amplifier amp, Tuner tuner, DvdPlayer dvd, CDPlayer cd, Projector projector,
			TheaterLights lights, Screen screen, PopcornPopper popper) {
		super();
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie){
		System.out.println("Get ready for the fire...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie(){
		System.out.println("Thanks for watching");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}

}
