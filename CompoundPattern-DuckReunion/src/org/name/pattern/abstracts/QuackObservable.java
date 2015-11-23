package org.name.pattern.abstracts;



public interface QuackObservable{
	public void registerObserver(Observer observer);
	public void notifyObservers();

}
