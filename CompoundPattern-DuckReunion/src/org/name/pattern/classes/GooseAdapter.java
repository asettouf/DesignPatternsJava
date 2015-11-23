package org.name.pattern.classes;

import org.name.pattern.abstracts.Observer;
import org.name.pattern.abstracts.Quackable;

public class GooseAdapter implements Quackable {
	protected Goose goose;
	protected Observable observable;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		this.observable = new Observable(this);
	}


	@Override
	public void quack() {
		this.goose.honk();
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
