package org.builder.pattern.abstracts;

import org.builder.pattern.entities.Maze;

public abstract class MazeBuilder {
	protected Maze currentMaze;
	
	public abstract void buildMaze();
	public abstract void buildRoom(int room);
	public abstract void buildDoor(int roomFrom, int roomTo);
	public abstract Maze getMaze();
}
