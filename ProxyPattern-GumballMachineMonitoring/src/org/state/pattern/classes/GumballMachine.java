package org.state.pattern.classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.state.pattern.abstracts.GumballMachineRemote;
import org.state.pattern.abstracts.State;

public class GumballMachine extends UnicastRemoteObject 
  implements GumballMachineRemote {
	protected State hasQuarterState = new hasQuarterState(this);
	protected  State noQuarterState = new NoQuarterState(this);
	protected  State soldState = new soldState(this);
	protected  State soldOutState = new soldOutState(this);
	
	protected State state;
	protected int count = 0;
	protected String location;
	


	public GumballMachine(String location, int count) throws RemoteException {
		this.location = location;
		this.count = count;
		if (this.count > 0){
			this.setState(this.getNoQuarterState());
		}
	} 
	
	public void insertQuarter(){
		this.state.insertQuarter();
	}
	
	public void ejectQuarter(){
		this.state.ejectQuarter();
	}
	
	public void turnCrank(){
		this.state.turnCrank();
		this.state.dispense();
	}
	
	public void releaseBall(){
		System.out.println("A gumball is rolling...");
		if (this.count != 0){
			this.count--;
		}
	}
	
	public void refill(int numberOfGumballs){
		System.out.println("Refilling");
		this.setCount(numberOfGumballs);
		this.state = this.noQuarterState;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

		
		public String toString(){
			return "Gumball Machine in state " + this.state + "\nGumball Machine has "
		+ this.count + " gumballs remaining";
		}
	
	
}
