package org.iterator.pattern.classes;

import org.iterator.pattern.abstracts.Iterator;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu(){
		Iterator pancakeIterator = this.pancakeHouseMenu.createIterator();
		Iterator dinerIterator = this.dinerMenu.createIterator();
		System.out.println("MENU BREAKFAST");
		this.printMenu(pancakeIterator);
		System.out.println("MENU Dinner");
		this.printMenu(dinerIterator);
		
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
