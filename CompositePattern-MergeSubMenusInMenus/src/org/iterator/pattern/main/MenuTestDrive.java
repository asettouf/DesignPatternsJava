package org.iterator.pattern.main;

import org.iterator.pattern.abstracts.MenuComponent;
import org.iterator.pattern.classes.Menu;
import org.iterator.pattern.classes.MenuItem;
import org.iterator.pattern.classes.Waitress;

public class MenuTestDrive {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Diner");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Lunch");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(cafeMenu);
		allMenus.add(dinerMenu);
		
		dinerMenu.add(new MenuItem("Vegetarian BLT", "Bacon, lettuce, tomatoes", true, 2.99));
		dinerMenu.add(new MenuItem("BLT", "Bacon, lettuce, tomatoes", false, 2.99));
		dinerMenu.add(new MenuItem("Soup of the day", "Soup and side potato dish", true, 3.29));
		dinerMenu.add(new MenuItem("Hotdog", "Who doesn't know what a hot dog is?!", false, 3.05));
		
		cafeMenu.add(new MenuItem("Veggie Burger and fries", "Veggie burger and fries", 
				true, 3.99));
		cafeMenu.add(new MenuItem("Soup of the day", "A cup of soup", false, 3.69));
		cafeMenu.add(new MenuItem("Burrito", "A large burrito", false, 4.29));
		
		pancakeHouseMenu.add(new MenuItem("Pancake Breakfast", "Pancakes with scrambled eggs",
				true, 2.99));
		pancakeHouseMenu.add(new MenuItem("Standard Pancake Breakfast", "Pancakes with fried eggs and"
				+ "sausage",
				false, 2.99));
		pancakeHouseMenu.add(new MenuItem("Blueberry Breakfast", "Pancakes with blueberry",
				true, 3.49));
		pancakeHouseMenu.add(new MenuItem("Wafles", "Wafles with your choice of pancakes",
				true, 3.59));
		
		dessertMenu.add(new MenuItem("Apple pie", "Pie with apple", true, 1.05));

		dinerMenu.add(dessertMenu);
		
		Waitress waitress = new Waitress(allMenus);
		//waitress.printMenu();
		waitress.printVegetarianMenus();
	}

}
