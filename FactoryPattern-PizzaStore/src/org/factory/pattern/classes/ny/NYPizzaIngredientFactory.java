package org.factory.pattern.classes.ny;

import org.factory.pattern.abstracts.Cheese;
import org.factory.pattern.abstracts.Clam;
import org.factory.pattern.abstracts.Dough;
import org.factory.pattern.abstracts.Pepperoni;
import org.factory.pattern.abstracts.PizzaIngredientFactory;
import org.factory.pattern.abstracts.Sauce;
import org.factory.pattern.abstracts.Veggie;
import org.factory.pattern.classes.ingredients.FreshClam;
import org.factory.pattern.classes.ingredients.Garlic;
import org.factory.pattern.classes.ingredients.MarinaraSauce;
import org.factory.pattern.classes.ingredients.Mushroom;
import org.factory.pattern.classes.ingredients.Onion;
import org.factory.pattern.classes.ingredients.ReggianoCheese;
import org.factory.pattern.classes.ingredients.SlicedPepperoni;
import org.factory.pattern.classes.ingredients.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public NYPizzaIngredientFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggie[] createVeggies() {
		Veggie veggies[] =  {new Onion(), new Garlic(), new Mushroom()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clam createClam() {
		return new FreshClam();
	}

}
