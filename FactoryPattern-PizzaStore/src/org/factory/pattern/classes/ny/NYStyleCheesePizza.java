package org.factory.pattern.classes.ny;

import org.factory.pattern.abstracts.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		this.name = "NY Style Cheese";
		this.dough = "Thin Crust";
		this.sauce = "Marinata Sauce";
		
		this.toppings.add("Grated");
	}

}
