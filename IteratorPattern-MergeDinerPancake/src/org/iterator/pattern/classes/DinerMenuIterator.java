package org.iterator.pattern.classes;

import java.util.Iterator;

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

	@Override
	public void remove() {
		if (this.position <= 0){
			throw new IllegalStateException("Start to use next before trying to "
					+ "remove an item");
		}
		if(this.menuItems[this.position-1] != null){
			for (int i = 0 ; i < (this.menuItems.length - 1) ; i++){
				this.menuItems[i] = this.menuItems[i+1];
			}
			this.menuItems[this.menuItems.length - 1] = null;
		}
	}

}