package org.observer.pattern.classes;

import org.observer.pattern.interfaces.DisplayElement;
import org.observer.pattern.interfaces.Observer;
import org.observer.pattern.interfaces.Subject;
import org.observer.pattern.interfaces.WeatherSettings;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private WeatherSettings ws;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
		this.ws = new WeatherSetup(0, 0, 0);
	}

	@Override
	public void display() {
		System.out.println("Current Conditions: " + this.ws.getTemp()
		+ " °C degrees and " + this.ws.getHumidity() + "% humidity");

	}

	@Override
	public void update(WeatherSettings ws) {
		this.ws.setHumidity(ws.getHumidity());
		this.ws.setTemp(ws.getTemp());
		this.display();

	}

}
