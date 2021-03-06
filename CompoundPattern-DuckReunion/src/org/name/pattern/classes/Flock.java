package org.name.pattern.classes;

import java.util.ArrayList;
import java.util.Iterator;

import org.name.pattern.abstracts.Observer;
import org.name.pattern.abstracts.Quackable;

public class Flock implements Quackable {
	protected ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quacker){
		this.quackers.add(quacker);
	}
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()){
			
			Quackable quacker = iterator.next();
			quacker.quack();
		}

	}
	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()){
			Quackable quacker = iterator.next();
			quacker.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
		/*Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()){
			Quackable quacker = iterator.next();
			quacker.notifyObservers();
		}*/
	}

}
