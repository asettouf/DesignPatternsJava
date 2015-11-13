package org.observer.pattern.classes;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
	}
	

	
	public void measurementChanged(){
		super.setChanged();
		super.notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementChanged();
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

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
