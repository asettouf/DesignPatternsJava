package org.name.pattern.classes;

import org.name.pattern.abstracts.CoffeinBeverage;

public class Coffee extends CoffeinBeverage {

	public Coffee() {
		// TODO Auto-generated constructor stub
	}
	

	public void brew(){
		System.out.println("Coffe grinds are being brewed");
	}
	
	public void addCondiment() {
		System.out.println("Adding sugar and milk");
	}
}
