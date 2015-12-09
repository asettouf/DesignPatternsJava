package org.builder.pattern.main;

import org.builder.pattern.entities.MazeGame;
import org.builder.pattern.entities.StandardMazeBuilder;

public class MazeTestDrive {

	public static void main(String[] args) {
		MazeGame mazeGame = new MazeGame(10);
		StandardMazeBuilder builder = new StandardMazeBuilder();
		mazeGame.createMaze(builder);
	}

}
