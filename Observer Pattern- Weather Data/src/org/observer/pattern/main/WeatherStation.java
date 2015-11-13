package org.observer.pattern.main;

import org.observer.pattern.classes.CurrentConditionDisplay;
import org.observer.pattern.classes.WeatherData;
import org.observer.pattern.classes.WeatherSetup;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd);
		WeatherSetup ws = new WeatherSetup(30, 65, 30.4f);
		
		wd.setMeasurements(ws);

	}

}
