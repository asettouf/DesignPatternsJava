package org.name.pattern.classes;

import org.name.pattern.abstracts.BeatModelInterface;
import org.name.pattern.abstracts.ControllerInterface;

public class Controller implements ControllerInterface {
	protected BeatModelInterface model;
	protected DJView view;
	
	public Controller(BeatModelInterface model) {
		this.model = model;
		this.view = new DJView(this, this.model);
		this.view.createView();
		this.view.createControls();
		this.view.disableStopMenuItem();
		this.view.enableStartMenuItem();
		this.model.initialize();
	}

	@Override
	public void start() {
		this.model.on();
		this.view.disableStopMenuItem();
		this.view.enableStartMenuItem();
	}

	@Override
	public void stop() {
		this.model.off();
		this.view.disableStopMenuItem();
		this.view.enableStartMenuItem();
	}

	@Override
	public void increaseBPM() {
		int bpm = this.model.getBPM();
		this.model.setBPM(bpm + 1);
	}

	@Override
	public void decreaseBPM() {
		int bpm = this.model.getBPM();
		this.model.setBPM(bpm - 1);

	}

	@Override
	public void setBPM(int bpm) {
		this.model.setBPM(bpm);
	}

}
