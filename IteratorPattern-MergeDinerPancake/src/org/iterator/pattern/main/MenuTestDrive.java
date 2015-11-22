package org.iterator.pattern.main;

import java.util.ArrayList;

import org.iterator.pattern.classes.CafeMenu;
import org.iterator.pattern.classes.DinerMenu;
import org.iterator.pattern.classes.PancakeHouseMenu;
import org.iterator.pattern.classes.Waitress;

public class MenuTestDrive {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		ArrayList menus = new ArrayList<>();
		
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		menus.add(cafeMenu);
		
		Waitress waitress = new Waitress(menus);
		
		waitress.printMenu();
	}

}
