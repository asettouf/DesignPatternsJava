package org.iterator.pattern.classes;

import java.util.ArrayList;
import java.util.Iterator;

import org.iterator.pattern.abstracts.Menu;


public class PancakeHouseMenu implements Menu{
	
	protected ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		this.menuItems = new ArrayList<MenuItem>();
		
		this.addItem("Pancake Breakfast", "Pancakes with scrambled eggs",
				true, 2.99);
		this.addItem("Standard Pancake Breakfast", "Pancakes with fried eggs and"
				+ "sausage",
				false, 2.99);
		this.addItem("Blueberry Breakfast", "Pancakes with blueberry",
				true, 3.49);
		
		this.addItem("Wafles", "Wafles with your choice of pancakes",
				true, 3.59);
	}
	
	public void addItem(String name, String desc, boolean vegetarian,
			double price){
		this.menuItems.add(new MenuItem(name, desc, vegetarian, price));
	}
	
	public Iterator<MenuItem> createIterator(){
		return this.menuItems.iterator();
	}
	

}
