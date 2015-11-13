package org.observer.pattern.classes;

import java.util.Observable;
import java.util.Observer;

import org.observer.pattern.interfaces.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	Observable observable;
	private float temp;
	private float humidity;

	public CurrentConditionDisplay(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Conditions: " + this.getTemp()
		+ " °C degrees and " + this.getHumidity() + "% humidity");

	}


	@Override
	public void update(Observable obs, Object obj) {
		if (obj instanceof WeatherData){
			WeatherData wd = (WeatherData) obs;
			this.temp = wd.getTemp();
			this.humidity = wd.getHumidity();
			display();
		}
		
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

}
