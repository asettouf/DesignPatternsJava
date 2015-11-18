package org.command.pattern.classes;

import org.command.pattern.abstracts.Command;

public class CeilingFanOnCommand implements Command {
	private CeilingFan fan;
	public CeilingFanOnCommand(CeilingFan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		this.fan.on();
	}

}
