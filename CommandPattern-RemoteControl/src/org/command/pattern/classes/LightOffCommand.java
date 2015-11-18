package org.command.pattern.classes;

import org.command.pattern.abstracts.Command;

public class LightOffCommand implements Command {
	private Light light;
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.off();
	}

}
