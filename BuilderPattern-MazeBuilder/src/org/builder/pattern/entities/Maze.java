package org.builder.pattern.entities;

import java.util.ArrayList;
import java.util.Iterator;

//Product class
public class Maze {	
	private ArrayList<Room> rooms = new ArrayList<Room>();
	private ArrayList<Wall> walls = new ArrayList<Wall>();
	private ArrayList<Door> doors = new ArrayList<Door>();
	
	public Maze() {
		System.out.println("New Maze");
	}
	
	public void addRoom(Room room){
		this.rooms.add(room);
		System.out.println("Created room");
	}
	
	//see the iterator pattern here
	public Room roomNo(int roomNumber){
		Room room = null;
		Iterator<Room> iterator = this.rooms.iterator();
		while (iterator.hasNext()){
			Room buffRoom = iterator.next();
			if (buffRoom.getRoomNumber() == roomNumber){
				room = buffRoom;
			}
		}
		return room;
	}
	
	public void addWall(Wall wall){
		this.walls.add(wall);
		System.out.println("Created wall");
		
	}
	
	public void addDoor(Door door){
		this.doors.add(door);
		System.out.println("Creating door");
	}
	
	
}
