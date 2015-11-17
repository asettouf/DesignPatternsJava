package org.factory.pattern.classes;

import org.factory.pattern.abstracts.Pizza;
import org.factory.pattern.abstracts.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	protected PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
		this.name = "Cheese Pizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + this.name);
		this.dough = this.ingredientFactory.createDough();
		this.sauce = this.ingredientFactory.createSauce();
		this.cheese = this.ingredientFactory.createCheese();

	}

}
