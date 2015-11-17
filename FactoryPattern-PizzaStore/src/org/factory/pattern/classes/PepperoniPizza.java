package org.factory.pattern.classes;

import org.factory.pattern.abstracts.Pizza;
import org.factory.pattern.abstracts.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
	protected PizzaIngredientFactory ingredientFactory;
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.name = "Pepperoni Pizza";
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	public void prepare() {
		System.out.println("Preparing " + this.name);
		this.dough = this.ingredientFactory.createDough();
		this.sauce = this.ingredientFactory.createSauce();
		this.cheese = this.ingredientFactory.createCheese();
		this.pepperoni = this.ingredientFactory.createPepperoni();
		
	}

}
