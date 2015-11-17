package org.factory.pattern.abstracts;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggie[] createVeggies();
	public Pepperoni createPepperoni();
	public Clam createClam();

}
