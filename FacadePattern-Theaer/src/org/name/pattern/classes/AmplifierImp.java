package org.name.pattern.classes;

import org.name.pattern.abstracts.Amplifier;
import org.name.pattern.abstracts.DvdPlayer;

public class AmplifierImp implements Amplifier {
	protected String name;
	public AmplifierImp() {
		this.name="Amplifier";
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
	public void setDvd(DvdPlayer dvd) {
		System.out.println(this.name + " has set " +dvd.getName());
	}

	@Override
	public void setSurroundSound() {
		System.out.println(this.name + " has set surround sound");

	}

	@Override
	public void setVolume(int vol) {
		System.out.println(this.name + " has set volume to " + vol);

	}

}
