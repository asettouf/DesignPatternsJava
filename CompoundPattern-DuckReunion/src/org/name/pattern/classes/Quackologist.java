package org.name.pattern.classes;

import org.name.pattern.abstracts.Observer;
import org.name.pattern.abstracts.QuackObservable;

public class Quackologist implements Observer {
	protected String name;
	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck.getClass().getName() + " just quacked");
		this.name = "COCO";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.getName();
	}

}
