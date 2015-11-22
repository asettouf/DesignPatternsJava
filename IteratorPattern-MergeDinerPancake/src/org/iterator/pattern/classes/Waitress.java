package org.iterator.pattern.classes;

import java.util.ArrayList;
import java.util.Iterator;

import org.iterator.pattern.abstracts.Menu;

public class Waitress{
	protected ArrayList menus;


	public Waitress(ArrayList menus) {
		this.menus = menus;
	}

	public void printMenu(){
		System.out.println("MENU");	
		Iterator menuIterator = this.menus.iterator();
		while (menuIterator.hasNext()){
			Menu menu = (Menu) menuIterator.next();
			this.printMenu(menu.createIterator());
		}
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
