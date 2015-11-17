package org.factory.pattern.classes;

import org.factory.pattern.abstracts.Pizza;
import org.factory.pattern.abstracts.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	protected PizzaIngredientFactory ingredientFactory;
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.name = "Clam Pizza";
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + this.name);
		this.dough = this.ingredientFactory.createDough();
		this.sauce = this.ingredientFactory.createSauce();
		this.cheese = this.ingredientFactory.createCheese();
		this.clam = this.ingredientFactory.createClam();

	}

}
