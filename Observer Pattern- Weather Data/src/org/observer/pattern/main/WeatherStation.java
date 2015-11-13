package org.observer.pattern.main;

import org.observer.pattern.classes.CurrentConditionDisplay;
import org.observer.pattern.classes.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd);
		wd.setMeasurements(30, 40.4f, 30.3f);
		ccd.update(wd, wd);
		wd.setMeasurements(23, 64f, 29.3f);
		ccd.update(wd, wd);
		
	}

}
