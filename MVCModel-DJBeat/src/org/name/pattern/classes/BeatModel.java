package org.name.pattern.classes;

import java.util.ArrayList;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;

import org.name.pattern.abstracts.BPMObserver;
import org.name.pattern.abstracts.BeatModelInterface;
import org.name.pattern.abstracts.BeatObserver;

public class BeatModel implements BeatModelInterface, MetaEventListener {

	protected Sequencer sequencer;
	protected ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	protected ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	protected int bpm = 90;
	
	@Override
	public void initialize() {
	}

	@Override
	public void on() {
		this.sequencer.start();
		this.setBPM(90);
	}

	@Override
	public void off() {
		this.setBPM(0);
		this.sequencer.stop();
	}

	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
		this.sequencer.setTempoInBPM(this.getBPM());
		this.notifyBPMObservers();
	}

	@Override
	public int getBPM() {
		return this.bpm;
	}
	
	protected void notifyBPMObservers(){
		
	}
	
	protected void notifyBeatObservers(){
		
	}
	@Override
	public void registerObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meta(MetaMessage arg0) {
		// TODO Auto-generated method stub
		
	}

}
