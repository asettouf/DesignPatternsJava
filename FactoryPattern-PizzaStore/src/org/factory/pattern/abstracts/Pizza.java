package org.factory.pattern.abstracts;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggie veggies[];
	protected Pepperoni pepperoni;
	protected Cheese cheese;
	protected Clam clam;
	protected boolean isReady;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public abstract void prepare();

	public void bake() {
		System.out.println("Baking");

	}

	public void cut() {
		System.out.println("Cutting");

	}
	
	public void box() {
		System.out.println("Boxing");
		this.setReady(true);

	}

	
	public boolean isReady() {
		return isReady;
	}
	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
