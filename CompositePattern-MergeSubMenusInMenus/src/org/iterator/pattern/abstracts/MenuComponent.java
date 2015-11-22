package org.iterator.pattern.abstracts;

import java.util.Iterator;

public abstract class MenuComponent {
	
	public abstract Iterator createIterator();
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	
	public String getName(){
		throw new UnsupportedOperationException();
	}
	
	public String getDesc(){
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian(){
		throw new UnsupportedOperationException();
	}
	
	public void print(){
		throw new UnsupportedOperationException();
	}
}
