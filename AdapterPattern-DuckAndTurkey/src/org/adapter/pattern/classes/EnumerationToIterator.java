package org.adapter.pattern.classes;

import java.util.Enumeration;
import java.util.Iterator;

//a real adapter!
public class EnumerationToIterator implements Iterator<Object> {
	protected Enumeration<?> enume;
	
	public EnumerationToIterator(Enumeration<?> enume){
		this.enume = enume;
	}
	@Override
	public boolean hasNext() {
		return this.enume.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return this.enume.nextElement();
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}

}
