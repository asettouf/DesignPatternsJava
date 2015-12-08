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
		// TODO Auto-generated method stub

	}

	@Override
	public void buildDoor(int roomFrom, int roomTo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Maze getMaze() {
		// TODO Auto-generated method stub
		return this.currentMaze;
	}

}
