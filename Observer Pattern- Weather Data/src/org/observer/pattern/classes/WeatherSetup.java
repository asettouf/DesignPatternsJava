package org.observer.pattern.classes;

import org.observer.pattern.interfaces.WeatherSettings;

public class WeatherSetup extends WeatherSettings {
	
	public WeatherSetup(float temp, float humidity, float pressure){
		super.temp = temp; 
		super.humidity = humidity;
		super.pressure = pressure;
	}
	@Override
	public float getTemp() {
		// TODO Auto-generated method stub
		return super.getTemp();
	}

	@Override
	public void setTemp(float temp) {
		// TODO Auto-generated method stub
		super.setTemp(temp);
	}

	@Override
	public float getHumidity() {
		// TODO Auto-generated method stub
		return super.getHumidity();
	}

	@Override
	public void setHumidity(float humidity) {
		// TODO Auto-generated method stub
		super.setHumidity(humidity);
	}

	@Override
	public float getPressure() {
		// TODO Auto-generated method stub
		return super.getPressure();
	}

	@Override
	public void setPressure(float pressure) {
		// TODO Auto-generated method stub
		super.setPressure(pressure);
	}

}
