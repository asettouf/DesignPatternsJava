package org.factory.pattern.classes;

import org.factory.pattern.abstracts.Pizza;

public class SimplePizzaFactory {

	public SimplePizzaFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")){
			pizza = new Clam();
		} else if (type.equals("veggie")){
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}

}
