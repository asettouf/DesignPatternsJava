package org.decorator.pattern.main;

import org.decorator.pattern.abstracts.Beverage;
import org.decorator.pattern.classes.Espresso;
import org.decorator.pattern.classes.HouseBlend;
import org.decorator.pattern.classes.Mocha;
import org.decorator.pattern.classes.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDesc() + " costs " + espresso.cost());
		
		Beverage houseblend = new HouseBlend();
		houseblend = new Mocha(houseblend);
		houseblend = new Mocha(houseblend);
		houseblend = new Whip(houseblend);
		System.out.println(houseblend.getDesc() + " costs " + houseblend.cost());
	}

}
