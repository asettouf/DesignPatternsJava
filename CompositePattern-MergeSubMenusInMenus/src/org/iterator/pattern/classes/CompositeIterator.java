package org.iterator.pattern.classes;

import java.util.Iterator;
import java.util.Stack;

import org.iterator.pattern.abstracts.MenuComponent;

public class CompositeIterator implements Iterator {
	protected Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		this.stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		//System.out.println(this.stack.peek());
		if (this.stack.empty()){
			return false;
		} else {
			Iterator iterator = (Iterator) this.stack.peek();
			if(!iterator.hasNext()){
				this.stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
		
	}

	@Override
	public Object next() {
		if (this.hasNext()){
			Iterator iterator = (Iterator) this.stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu){
				this.stack.push(component.createIterator());
			}
			return component;
		} else {
		return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
