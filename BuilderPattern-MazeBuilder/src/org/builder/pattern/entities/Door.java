package org.builder.pattern.entities;

public class Door {
	protected Room roomFrom;
	protected Room roomTo;
	
	public Door(Room roomFrom, Room roomTo) {
		this.roomFrom = roomFrom;
		this.roomTo = roomTo;
	}

}
