package org.factory.pattern.abstracts;

public abstract class Pizza {
	private boolean isReady;
	
	public void prepare() {
		System.out.println("Prepping");

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


}
