package org.name.pattern.main;

import org.name.pattern.classes.Coffee;
import org.name.pattern.classes.Tea;

public class CoffeeTestDrive {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
		
		Tea tea = new Tea();
		tea.prepareRecipe();
	}

}
