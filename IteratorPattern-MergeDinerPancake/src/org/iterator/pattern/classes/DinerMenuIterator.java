package org.iterator.pattern.classes;

import org.iterator.pattern.abstracts.Iterator;

public class DinerMenuIterator implements Iterator {
	MenuItem[] menuItems;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (position >= this.menuItems.length || this.menuItems[this.position] == null){
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = this.menuItems[this.position];
		this.position++;
		return menuItem;
	}

}
