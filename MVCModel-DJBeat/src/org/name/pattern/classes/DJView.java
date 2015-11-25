package org.name.pattern.classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.name.pattern.abstracts.BPMObserver;
import org.name.pattern.abstracts.BeatModelInterface;
import org.name.pattern.abstracts.BeatObserver;
import org.name.pattern.abstracts.ControllerInterface;

public class DJView implements BeatObserver, BPMObserver, ActionListener {
	protected BeatModelInterface model;
	protected ControllerInterface controller;
	protected JFrame viewFrame;
	protected JPanel viewPanel;
	protected BeatBar beatBar;
	protected JLabel bpmOutputLabel;
	protected JFrame controlFrame;
	protected JPanel controlPanel;
	protected JLabel bpmLabel;
	protected JTextField bpmTextField;
	protected JButton setBPMButton;
	protected JButton increaseBPMButton;
	protected JButton decreaseBPMButton;
	protected JMenuBar menuBar;
	protected JMenu menu;
	protected JMenuItem startMenuItem;
	protected JMenuItem stopMenuItem;
	
	
	
	public DJView(ControllerInterface controller,BeatModelInterface model) {
		this.model = model;
		this.controller = controller;
		this.model.registerObserver((BeatObserver) this);
		this.model.registerObserver((BPMObserver) this);
	}

	//Create swing components
	public void createView(){
		this.viewPanel = new JPanel(new GridLayout(1, 2));
		this.viewFrame = new JFrame("View");
		this.viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.viewFrame.setSize(new Dimension(100,100));
		this.bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
		this.beatBar = new BeatBar();
		this.beatBar.setValue(0);
		JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
		bpmPanel.add(this.beatBar);
		bpmPanel.add(this.bpmOutputLabel);
		this.viewPanel.add(bpmPanel);
		this.viewFrame.getContentPane().add(this.viewPanel, BorderLayout.CENTER);
		this.viewFrame.pack();
		this.viewFrame.setVisible(true);
	}
	
	//Create more swing components
	public void createControls(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		this.controlFrame = new JFrame("Control");
		this.controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.controlFrame.setSize(new Dimension(100, 80));
		
		this.controlPanel = new JPanel(new GridLayout(1, 2));
		
		this.menuBar = new JMenuBar();
		this.menu = new JMenu("DJ Control");
		this.startMenuItem = new JMenuItem("Start");
		this.menu.add(this.startMenuItem);
		this.startMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.start();
			}
		});
		
		this.stopMenuItem = new JMenuItem("Stop");
		this.menu.add(this.stopMenuItem);
		this.stopMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.stop();
			}
		});
		
		JMenuItem exit = new JMenuItem("Quit");	
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		this.menu.add(exit);
		this.menuBar.add(this.menu);
		this.controlFrame.setJMenuBar(this.menuBar);
		
		this.bpmTextField = new JTextField(2);
		this.bpmLabel = new JLabel("Enter BPM: ", SwingConstants.RIGHT);
		this.setBPMButton = new JButton("Set");
		this.setBPMButton.setSize(new Dimension(10, 40));
		this.increaseBPMButton = new JButton(">>");
		this.decreaseBPMButton = new JButton("<<");
		this.setBPMButton.addActionListener(this);
		this.increaseBPMButton.addActionListener(this);
		this.decreaseBPMButton.addActionListener(this);
		
		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		
		buttonPanel.add(this.decreaseBPMButton);
		buttonPanel.add(this.increaseBPMButton);
		
		JPanel enterPanel = new JPanel(new GridLayout(1, 2));
		
		enterPanel.add(this.bpmLabel);
		enterPanel.add(this.bpmTextField);
		
		JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
		insideControlPanel.add(enterPanel);
		insideControlPanel.add(this.setBPMButton);
		insideControlPanel.add(buttonPanel);
		this.controlPanel.add(insideControlPanel);
		
		this.bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		this.bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		this.controlFrame.getRootPane().setDefaultButton(this.setBPMButton);
		this.controlFrame.getContentPane().add(this.controlPanel, BorderLayout.CENTER);
		
		this.controlFrame.pack();
		this.controlFrame.setVisible(true);
		
	}
	
	public void enableStopMenuItem(){
		this.stopMenuItem.setEnabled(true);
	}
	
	public void disableStopMenuItem(){
		this.stopMenuItem.setEnabled(false);
	}
	
	public void enableStartMenuItem(){
		this.startMenuItem.setEnabled(true);
	}
	
	public void disableStartMenuItem(){
		this.startMenuItem.setEnabled(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == this.setBPMButton){
			int bpm = Integer.parseInt(this.bpmTextField.getText());
			this.controller.setBPM(bpm);
		}else if(event.getSource() == this.increaseBPMButton){
			this.controller.increaseBPM();
		} else if(event.getSource() == this.decreaseBPMButton){
			this.controller.decreaseBPM();
		} 
		
	}



	@Override
	public void updateBPM() {
		int bpm = this.model.getBPM();
		if(bpm == 0){
			this.bpmOutputLabel.setText("Offline");
		} else{
			this.bpmOutputLabel.setText("Current BPM: " + bpm);;
		}
	}


	@Override
	public void updateBeat() {
		this.beatBar.setValue(100);
	}

}
