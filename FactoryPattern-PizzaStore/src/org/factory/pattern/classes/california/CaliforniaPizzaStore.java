package org.factory.pattern.classes.california;

import org.factory.pattern.abstracts.Pizza;
import org.factory.pattern.abstracts.PizzaIngredientFactory;
import org.factory.pattern.abstracts.PizzaStore;
import org.factory.pattern.classes.CheesePizza;
import org.factory.pattern.classes.ClamPizza;
import org.factory.pattern.classes.PepperoniPizza;
import org.factory.pattern.classes.VeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

	public CaliforniaPizzaStore() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
		if(type.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
		} else if (type.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
		} else if (type.equals("veggie")){
			pizza = new VeggiePizza(ingredientFactory);
		}
		
		return pizza;
	}
}


