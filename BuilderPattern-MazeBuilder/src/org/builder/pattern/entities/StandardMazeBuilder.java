package org.builder.pattern.entities;

import org.builder.pattern.abstracts.MazeBuilder;

public class StandardMazeBuilder extends MazeBuilder {

	public StandardMazeBuilder() {
		this.currentMaze = null;
	}
	@Override
	public void buildMaze() {
		this.currentMaze = new Maze();
	}

	@Override
	public void buildRoom(int room) {
		this.currentMaze.addRoom(new Room(room));
	}

	@Override
	public void buildDoor(int roomFrom, int roomTo) {
		this.currentMaze.addDoor(new Door(this.currentMaze.roomNo(roomFrom),
				this.currentMaze.roomNo(roomTo)));
	}

	@Override
	public Maze getMaze() {
		System.out.println("Maze created");
		return this.currentMaze;
	}

}
