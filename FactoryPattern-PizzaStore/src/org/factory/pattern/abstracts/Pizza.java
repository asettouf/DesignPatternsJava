package org.factory.pattern.abstracts;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected boolean isReady;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + this.name);
		System.out.println("Tossing dough " + this.dough);
		System.out.println("Adding sauce " + this.sauce);
		for (int i = 0; i<toppings.size(); i++){
			System.out.println(" " + toppings.get(i));
		}

	}

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
