package org.name.pattern.classes;

import java.util.ArrayList;
import java.util.Iterator;

import org.name.pattern.abstracts.Observer;
import org.name.pattern.abstracts.QuackObservable;

public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
	
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> iterator = this.observers.iterator();
		
		while(iterator.hasNext()){
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

}
