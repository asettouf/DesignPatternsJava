package org.command.pattern.classes;

import org.command.pattern.abstracts.Command;

public class CeilingFanOffCommand implements Command {
	private CeilingFan fan;
	
	public CeilingFanOffCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		this.fan.off();

	}

	@Override
	public void undo() {
		this.fan.on();
	}

}
