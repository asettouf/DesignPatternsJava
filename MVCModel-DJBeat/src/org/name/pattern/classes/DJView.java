package org.name.pattern.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.name.pattern.abstracts.BPMObserver;
import org.name.pattern.abstracts.BeatModelInterface;
import org.name.pattern.abstracts.BeatObserver;
import org.name.pattern.abstracts.ControllerInterface;

public class DJView implements BeatObserver, BPMObserver, ActionListener {
	protected BeatModelInterface model;
	protected ControllerInterface controller;
	protected JFrame viewFrame;
	protected JPanel viewPanel;
	protected beatBar beatBar;
	protected JLabel bpmOutputLabel;
	
	
	public DJView(ControllerInterface controller,BeatModelInterface model) {
		this.model = model;
		this.controller = controller;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
