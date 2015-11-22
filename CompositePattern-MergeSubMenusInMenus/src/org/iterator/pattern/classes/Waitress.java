package org.iterator.pattern.classes;

import org.iterator.pattern.abstracts.MenuComponent;

public class Waitress{
	protected MenuComponent allMenus;


	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu(){
		this.allMenus.print();
	}
	


}
