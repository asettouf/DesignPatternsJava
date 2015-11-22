package org.iterator.pattern.classes;

import java.util.Iterator;

import org.iterator.pattern.abstracts.Menu;

public class Waitress {
	protected Menu pancakeHouseMenu;
	protected Menu dinerMenu;
	protected Menu cafeMenu;
	
	
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu(){
		Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
		Iterator dinerIterator = this.dinerMenu.createIterator();
		Iterator cafeIterator = this.cafeMenu.createIterator();
		System.out.println("MENU BREAKFAST");
		this.printMenu(pancakeIterator);
		System.out.println("MENU Dinner");
		this.printMenu(dinerIterator);
		System.out.println("Menu Lunch");
		this.printMenu(cafeIterator);
	}
	
	public void printMenu(Iterator iterator){
		while (iterator.hasNext()){
			MenuItem item = (MenuItem) iterator.next();
			System.out.println(item.getName() + ", ");
			System.out.println(item.getPrice() + "--");
			System.out.println(item.getDesc());
		}
	}

}
