package org.factory.pattern.classes.california;

import org.factory.pattern.abstracts.Cheese;
import org.factory.pattern.abstracts.Clam;
import org.factory.pattern.abstracts.Dough;
import org.factory.pattern.abstracts.Pepperoni;
import org.factory.pattern.abstracts.PizzaIngredientFactory;
import org.factory.pattern.abstracts.Sauce;
import org.factory.pattern.abstracts.Veggie;
import org.factory.pattern.classes.ingredients.BlackOlives;
import org.factory.pattern.classes.ingredients.EggPlant;
import org.factory.pattern.classes.ingredients.FrozenClam;
import org.factory.pattern.classes.ingredients.Mozarella;
import org.factory.pattern.classes.ingredients.PlumTomatoSauce;
import org.factory.pattern.classes.ingredients.SlicedPepperoni;
import org.factory.pattern.classes.ingredients.Spinach;
import org.factory.pattern.classes.ingredients.ThickCrustDough;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

	public CaliforniaPizzaIngredientFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozarella();
	}

	@Override
	public Veggie[] createVeggies() {
		Veggie veggies[] =  {new BlackOlives(), new Spinach(), new EggPlant()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clam createClam() {
		return new FrozenClam();
	}

}
