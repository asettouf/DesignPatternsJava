package org.factory.pattern.main;

import org.factory.pattern.abstracts.Pizza;
import org.factory.pattern.abstracts.PizzaStore;
import org.factory.pattern.classes.ny.NYPizzaStore;

public class PizzaCounter {

	public static void main(String[] args) {
		PizzaStore store = new NYPizzaStore();
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("I order " + pizza.getName());

	}

}
