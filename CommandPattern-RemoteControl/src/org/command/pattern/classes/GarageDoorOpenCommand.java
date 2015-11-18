package org.command.pattern.classes;

import org.command.pattern.abstracts.Command;

public class GarageDoorOpenCommand implements Command {
	
	private GarageDoor door;
	public GarageDoorOpenCommand(GarageDoor door) {
		this.door = door;
	}

	@Override
	public void execute() {
		this.door.up();
	}

	@Override
	public void undo() {
		this.door.down();
	}

}
