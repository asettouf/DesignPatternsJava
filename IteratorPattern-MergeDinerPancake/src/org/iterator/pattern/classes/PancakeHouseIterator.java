package org.iterator.pattern.classes;

import java.util.ArrayList;

import org.iterator.pattern.abstracts.Iterator;

public class PancakeHouseIterator implements Iterator {
	protected ArrayList<MenuItem> items;
	protected int position = 0;
	

	public PancakeHouseIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(this.position >= this.items.size()){
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem item = this.items.get(position);
		this.position++;
		return item;
	}

}
