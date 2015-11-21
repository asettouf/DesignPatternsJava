package org.iterator.pattern.main;

import org.iterator.pattern.classes.DinerMenu;
import org.iterator.pattern.classes.PancakeHouseMenu;
import org.iterator.pattern.classes.Waitress;

public class MenuTestDrive {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}

}
