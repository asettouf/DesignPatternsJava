package org.iterator.pattern.classes;

import java.util.Hashtable;
import java.util.Iterator;

import org.iterator.pattern.abstracts.Menu;

public class CafeMenu implements Menu{
	protected Hashtable<String, MenuItem> menuItems;
	
	public CafeMenu() {
		this.menuItems = new Hashtable<String, MenuItem>();
		this.addItem("Veggie Burger and fries", "Veggie burger and fries", 
				true, 3.99);
		this.addItem("Soup of the day", "A cup of soup", false, 3.69);
		this.addItem("Burrito", "A large burrito", false, 4.29);
	}
	
	public void addItem(String name, String desc, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
		this.menuItems.put(menuItem.getName(), menuItem);
	}


	@Override
	public Iterator createIterator() {
		return this.menuItems.values().iterator();
	}
}
