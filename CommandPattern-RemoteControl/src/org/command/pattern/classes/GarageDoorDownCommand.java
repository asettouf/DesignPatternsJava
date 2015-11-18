package org.command.pattern.classes;

import org.command.pattern.abstracts.Command;

public class GarageDoorDownCommand implements Command {
	private GarageDoor door;
	public GarageDoorDownCommand(GarageDoor door) {
		this.door = door;
	}

	@Override
	public void execute() {
		this.door.down();
	}

}
