package org.name.pattern.classes;

import org.name.pattern.abstracts.Observer;
import org.name.pattern.abstracts.Quackable;

public class DuckCall implements Quackable {
	protected Observable observable;
	
	public DuckCall() {
		this.observable = new Observable(this);
	}
	@Override
	public void quack() {
		System.out.println("Kwack");
		this.notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		this.observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		this.observable.notifyObservers();
	}

}
