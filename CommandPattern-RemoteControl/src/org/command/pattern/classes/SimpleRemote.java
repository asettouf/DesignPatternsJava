package org.command.pattern.classes;

import org.command.pattern.abstracts.Command;

public class SimpleRemote {
	private Command slot;
	public SimpleRemote() {
		
	}
	
	public void buttonWasPressed(){
		this.slot.execute();
	}
	
	public Command getSlot() {
		return slot;
	}
	public void setSlot(Command slot) {
		this.slot = slot;
	}

}
