package org.builder.pattern.entities;

import org.builder.pattern.abstracts.MazeBuilder;

//"Director" class
public class MazeGame {
	protected int numberOfRoom;
	
	public MazeGame(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}

	public Maze createMaze(MazeBuilder builder){
		builder.buildMaze();
		
		builder.buildRoom(1);
		builder.buildRoom(2);
		
		builder.buildDoor(1, 2);
		
		return builder.getMaze();
		
	}
	
	public Maze createComplexMaze(MazeBuilder builder){
		builder.buildMaze();
		for (int i=0; i<this.numberOfRoom; i++){
			builder.buildRoom(i);
		}
		
		return builder.getMaze();
			
	}
	
	

}
