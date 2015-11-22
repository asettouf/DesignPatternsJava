package org.iterator.pattern.classes;

import java.util.Iterator;

import org.iterator.pattern.abstracts.Menu;

public class DinerMenu implements Menu {
	
	protected static final int MAX_ITEMS = 6;
	protected int numberOfItems = 0;
	protected MenuItem[] menuItems;


	public DinerMenu() {
		this.menuItems = new MenuItem[MAX_ITEMS];
		
		this.addItem("Vegetarian BLT", "Bacon, lettuce, tomatoes", true, 2.99);
		this.addItem("BLT", "Bacon, lettuce, tomatoes", false, 2.99);
		this.addItem("Soup of the day", "Soup and side potato dish", true, 3.29);
		this.addItem("Hotdog", "Who doesn't know what a hot dog is?!", false, 3.05);
	}
	
	public void addItem(String name, String desc, boolean vegetarian,
			double price){
		MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
		
		if (this.numberOfItems > MAX_ITEMS){
			System.err.println("Sorry menu is full! Adding item impossible");
		} else {
			this.menuItems[this.numberOfItems] = menuItem;
			this.numberOfItems++;
		}
	}
	
	public Iterator createIterator(){
			return new DinerMenuIterator(this.menuItems);
	}

}
