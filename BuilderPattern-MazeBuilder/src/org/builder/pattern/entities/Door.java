package org.builder.pattern.entities;

import org.builder.pattern.abstracts.MapSite;

public class Door implements MapSite{
	
	protected Room roomFrom;
	protected Room roomTo;
	private boolean isOpen;
	
	public Door(Room roomFrom, Room roomTo) {
		this.roomFrom = roomFrom;
		this.roomTo = roomTo;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	
}
