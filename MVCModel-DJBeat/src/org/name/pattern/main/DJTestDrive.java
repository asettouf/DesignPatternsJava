package org.name.pattern.main;

import org.name.pattern.abstracts.BeatModelInterface;
import org.name.pattern.abstracts.ControllerInterface;
import org.name.pattern.classes.BeatModel;
import org.name.pattern.classes.Controller;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new Controller(model);
	}

}
