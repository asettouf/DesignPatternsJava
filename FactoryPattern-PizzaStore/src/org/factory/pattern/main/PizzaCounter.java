package org.factory.pattern.main;

import org.factory.pattern.abstracts.Pizza;
import org.factory.pattern.classes.PizzaStore;
import org.factory.pattern.classes.SimplePizzaFactory;

public class PizzaCounter {

	public static void main(String[] args) {
		PizzaStore store = new PizzaStore(new SimplePizzaFactory());
		Pizza pizza = null;
		pizza = store.orderPizza("cheese");
		System.out.println(pizza.getClass().getName());

	}

}
