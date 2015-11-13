package org.observer.pattern.classes;

import java.util.ArrayList;

import org.observer.pattern.interfaces.Observer;
import org.observer.pattern.interfaces.Subject;
import org.observer.pattern.interfaces.WeatherSettings;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private WeatherSettings ws;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
		this.ws = new WeatherSetup(0, 0, 0);
	}
	
	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		int i = this.observers.indexOf(o);
		if (i >= 0) {
			this.observers.remove(i);
		}

	}

	@Override
	public void notifyObservers() {
		for (int i=0; i<this.observers.size(); i++){
			this.observers.get(i).update(ws);
		}
	}
	
	public void measurementChanged(){
		this.notifyObservers();
	}
	
	public void setMeasurements(WeatherSetup ws){
		this.ws.setHumidity(ws.getHumidity());
		this.ws.setPressure(ws.getPressure());
		this.ws.setTemp(ws.getTemp());
		this.measurementChanged();
	}

}
