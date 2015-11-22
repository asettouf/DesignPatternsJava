package org.iterator.pattern.classes;

import java.util.ArrayList;
import java.util.Iterator;

import org.iterator.pattern.abstracts.MenuComponent;

public class Menu extends MenuComponent {
	protected ArrayList menuComponents;
	protected String name;
	protected String desc;
	
	public Menu(String name, String desc) {
		this.menuComponents = new ArrayList();
		this.name = name;
		this.desc = desc;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		this.menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return (MenuComponent) this.menuComponents.get(i);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDesc() {
		return this.desc;
	}

	@Override
	public void print() {
		System.out.println(this.getName());
		System.out.println(this.getDesc());
		System.out.println("----------------------------");
		
		Iterator iterator = this.menuComponents.iterator();
		while(iterator.hasNext()){
			MenuComponent component = (MenuComponent) iterator.next();
			component.print();
		}
	}

	@Override
	public Iterator createIterator() {
		Iterator iterator = this.menuComponents.iterator();
		return new CompositeIterator(iterator);
	}
	
	

}
