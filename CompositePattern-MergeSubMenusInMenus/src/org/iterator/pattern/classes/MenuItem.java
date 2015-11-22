package org.iterator.pattern.classes;

import java.util.Iterator;

import org.iterator.pattern.abstracts.MenuComponent;

public class MenuItem extends MenuComponent{
	protected String name;
	protected String desc;
	protected boolean vegetarian;
	protected double price;
	
	public MenuItem(String name, String desc, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.desc = desc;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void print(){
		System.out.println(" " + this.getName());
		if (this.isVegetarian()){
			System.out.println("(v)");
		}
		System.out.println(this.getPrice());
		System.out.println(" ------ " + this.getDesc());
	}


	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}
	
	

}
