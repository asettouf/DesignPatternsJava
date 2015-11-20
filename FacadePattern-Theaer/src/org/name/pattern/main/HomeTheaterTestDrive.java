package org.name.pattern.main;

import org.name.pattern.classes.AmplifierImp;
import org.name.pattern.classes.CDPlayerImp;
import org.name.pattern.classes.DVDPlayerImp;
import org.name.pattern.classes.HomeTheater;
import org.name.pattern.classes.PopCornPopperImp;
import org.name.pattern.classes.ProjectorImp;
import org.name.pattern.classes.ScreenImp;
import org.name.pattern.classes.TheaterLightsImp;
import org.name.pattern.classes.TunerImp;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		AmplifierImp amp = new AmplifierImp();
		CDPlayerImp cd = new CDPlayerImp();
		DVDPlayerImp dvd = new DVDPlayerImp();
		PopCornPopperImp popcorn = new PopCornPopperImp();
		ProjectorImp projector = new ProjectorImp();
		ScreenImp screen = new ScreenImp();
		TheaterLightsImp lights = new TheaterLightsImp();
		TunerImp tuner = new TunerImp();
		
		HomeTheater homeTheater = new HomeTheater(amp, tuner, dvd, cd, projector, lights, screen, popcorn);
		
		homeTheater.watchMovie("The Great Escape");
		homeTheater.endMovie();
	}

}
