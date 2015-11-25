package org.name.pattern.classes;

import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import org.name.pattern.abstracts.BPMObserver;
import org.name.pattern.abstracts.BeatModelInterface;
import org.name.pattern.abstracts.BeatObserver;

public class BeatModel implements BeatModelInterface, MetaEventListener {

	protected Sequencer sequencer;
	protected ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	protected ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	protected int bpm = 90;
	protected Sequence sequence;
	protected Track track;
	
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
	
	protected void beatEvent(){
		this.notifyBeatObservers();
	}
	
	protected void notifyBPMObservers(){
		Iterator<BPMObserver> iterator = this.bpmObservers.iterator();
		while(iterator.hasNext()){
			BPMObserver observer = iterator.next();
			observer.updateBPM();
		}
		
	}
	
	protected void notifyBeatObservers(){
		Iterator<BeatObserver> iterator = this.beatObservers.iterator();
		while(iterator.hasNext()){
			BeatObserver observer = iterator.next();
			observer.updateBeat();
		}
		
	}
	@Override
	public void registerObserver(BeatObserver o) {
		this.beatObservers.add(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		this.beatObservers.remove(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		this.bpmObservers.add(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		this.bpmObservers.remove(o);
	}

	@Override
	public void meta(MetaMessage arg0) {
		if (arg0.getType() == 47) {
			this.beatEvent();
			this.sequencer.start();
			this.setBPM(this.getBPM());
		}
	}
	
	public void setUpMidi() {
		try {
			this.sequencer = MidiSystem.getSequencer(true);
			this.sequencer.open();
			this.sequencer.addMetaEventListener(this);
			this.sequence = new Sequence(Sequence.PPQ, 4);
			this.track = this.sequence.createTrack();
			
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	public void buildTrackAndStart(){
		int[] trackList = {35,0,46,0};
		
		this.sequence.deleteTrack(null);
		this.track = this.sequence.createTrack();
		
		this.makeTracks(trackList);
		this.track.add(this.makeEvent(192, 9, 1, 0, 4));
		
		try{
			this.sequencer.setSequence(this.sequence);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void makeTracks(int[] list){
		for (int i = 0; i< list.length; i++){
			int key = list[i];
			
			if (key != 0){
				this.track.add(this.makeEvent(144,  9,  key,  100, i));
				this.track.add(this.makeEvent(128,  9,  key,  100, i + 1));
			}
		}
	}
	
	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
		MidiEvent event = null;
		
		try{
			ShortMessage a = new ShortMessage();
			a.setMessage(comd,chan,one,two);
			event = new MidiEvent(a, tick);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return event;
	}
	

}
