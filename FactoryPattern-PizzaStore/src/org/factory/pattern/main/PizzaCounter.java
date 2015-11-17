package org.factory.pattern.main;

import org.factory.pattern.abstracts.Pizza;
import org.factory.pattern.abstracts.PizzaStore;
import org.factory.pattern.classes.california.CaliforniaPizzaStore;
import org.factory.pattern.classes.ny.NYPizzaStore;

public class PizzaCounter {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza nyPizza = nyStore.orderPizza("cheese");
		System.out.println("NY Version:  " + nyPizza.getName());
		
		PizzaStore cStore = new CaliforniaPizzaStore();
		Pizza californiaPizza = cStore.orderPizza("cheese");
		System.out.println("California version: " +californiaPizza.getName());

	}

}
