package org.builder.pattern.entities;

import org.builder.pattern.abstracts.MapSite;

public class Room implements MapSite {
	private int roomNumber;
	private MapSite[] sides = new MapSite[4];

	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public MapSite getSide(Direction dir){
		return null;
		
	}
	
	public void setSide(Direction dir, MapSite ms){
		
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public MapSite[] getSides() {
		return sides;
	}

	public void setSides(MapSite[] sides) {
		this.sides = sides;
	}
	

}
