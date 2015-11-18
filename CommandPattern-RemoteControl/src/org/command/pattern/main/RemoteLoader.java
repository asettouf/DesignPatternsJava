package org.command.pattern.main;

import org.command.pattern.abstracts.Command;
import org.command.pattern.classes.CeilingFan;
import org.command.pattern.classes.CeilingFanOffCommand;
import org.command.pattern.classes.CeilingFanOnCommand;
import org.command.pattern.classes.GarageDoor;
import org.command.pattern.classes.GarageDoorDownCommand;
import org.command.pattern.classes.GarageDoorOpenCommand;
import org.command.pattern.classes.Light;
import org.command.pattern.classes.LightOffCommand;
import org.command.pattern.classes.LightOnCommand;
import org.command.pattern.classes.MacroCommand;
import org.command.pattern.classes.RemoteControl;
import org.command.pattern.classes.Stereo;
import org.command.pattern.classes.StereoOffCommand;
import org.command.pattern.classes.StereoOnWithCDCommand;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl(6);
		
		Light l1 = new Light("Living Room");
		Light l2 = new Light("Kitchen");
		CeilingFan c = new CeilingFan("Living Room");
		GarageDoor d = new GarageDoor();
		Stereo s = new Stereo("Living Room");
		
		LightOnCommand l1On = new LightOnCommand(l1);
		LightOffCommand l1Off = new LightOffCommand(l1);
		LightOnCommand l2On = new LightOnCommand(l2);
		LightOffCommand l2Off = new LightOffCommand(l2);
		
		CeilingFanOnCommand cOn = new CeilingFanOnCommand(c);
		CeilingFanOffCommand cOff = new CeilingFanOffCommand(c);
		
		StereoOnWithCDCommand sOn = new StereoOnWithCDCommand(s);
		StereoOffCommand sOff = new StereoOffCommand(s);
		
		GarageDoorOpenCommand dOn = new GarageDoorOpenCommand(d);
		GarageDoorDownCommand dDown = new GarageDoorDownCommand(d);
		
		Command[] commandOn = {l1On, l2On, sOn};
		Command[] commandOff = {l1Off, l2Off, sOff};
		
		MacroCommand mcOn = new MacroCommand(commandOn);
		MacroCommand mcOff = new MacroCommand(commandOff);
		remote.setCommand(0, l1On, l1Off);
		remote.setCommand(1, l2On, l2Off);
		remote.setCommand(2, cOn, cOff);
		remote.setCommand(3, sOn, sOff);
		remote.setCommand(4, dOn, dDown);
		remote.setCommand(5, mcOn, mcOff);
		
		System.out.println(remote);
		System.out.println("Party On ");
		mcOn.execute();
		System.out.println("Party Off");
		mcOff.execute();
		
	}

}
