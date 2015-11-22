package org.iterator.pattern.classes;

import java.util.Iterator;

import org.iterator.pattern.abstracts.MenuComponent;

public class Waitress{
	protected MenuComponent allMenus;


	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu(){
		this.allMenus.print();
	}
	
	public void printVegetarianMenus(){
		Iterator iterator = this.allMenus.createIterator();
		System.out.println("Veggie Menu");
		while (iterator.hasNext()) {
			MenuComponent component = (MenuComponent) iterator.next();
			try {
				if (component.isVegetarian()){
					component.print();
				}
			} catch (UnsupportedOperationException e){
				
			}
		}
	}


}
