package org.factory.pattern.classes;

import org.factory.pattern.abstracts.Pizza;

public class PizzaStore {
	
	private SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		
		pizza = this.factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
	public SimplePizzaFactory getFactory() {
		return factory;
	}
	public void setFactory(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	
}
