package org.command.pattern.main;

import org.command.pattern.classes.GarageDoor;
import org.command.pattern.classes.GarageDoorOpenCommand;
import org.command.pattern.classes.Light;
import org.command.pattern.classes.LightOnCommand;
import org.command.pattern.classes.SimpleRemote;

public class RemoteTest {

	public static void main(String[] args) {
		SimpleRemote remote = new SimpleRemote();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		remote.setSlot(lightOn);
		remote.buttonWasPressed();
		GarageDoor door = new GarageDoor();
		GarageDoorOpenCommand open = new GarageDoorOpenCommand(door);
		remote.setSlot(open);
		remote.buttonWasPressed();
	}

}
