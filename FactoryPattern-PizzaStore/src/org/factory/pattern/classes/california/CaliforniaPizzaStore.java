package org.factory.pattern.classes.california;

import org.factory.pattern.abstracts.Pizza;
import org.factory.pattern.abstracts.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {

	public CaliforniaPizzaStore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new CaliforniaStyleCheesePizza();
		} else if(type.equals("pepperoni")){
			pizza = new CaliforniaStylePepperoniPizza();
		} else if (type.equals("clam")){
			pizza = new CaliforniaStyleClamPizza();
		} else if (type.equals("veggie")){
			pizza = new CaliforniaStyleVeggiePizza();
		}
		
		return pizza;
	}
}


