package org.name.pattern.abstracts;

public abstract class CoffeinBeverage {
	
	public abstract void brew();
	public abstract void addCondiment();
	
	//template method
	public final void prepareRecipe(){
		this.boilWater();
		this.brew();
		this.pourInCup();
		if (customerWantsCondiment()){
			this.addCondiment();
		}
	}
	
	//hook function
	public boolean customerWantsCondiment(){
		return true;
	}
	public void boilWater(){
		System.out.println("Water is boiling");
	}
	
	public void pourInCup(){
		System.out.println("Pouring in cup");
	}
}
