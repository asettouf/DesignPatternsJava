package org.singleton.pattern.classes;

public class ChocolateBoiler {
	private static ChocolateBoiler cb;
	private boolean empty;
	private boolean boiled;
	
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	public static synchronized ChocolateBoiler getInstance(){
		if (cb == null){
			cb = new ChocolateBoiler();
		}
		return cb;
	}
	
	public void fill(){
		if (this.isEmpty()){
			this.setEmpty(true);
			this.setBoiled(false);
		}
	}
	
	public void drain(){
		if(!this.isEmpty() && this.isBoiled()){
			this.setEmpty(true);
		}
	}
	
	public void boil(){
		if(!this.isEmpty() && !this.isBoiled()){
			this.setBoiled(true);
		}
	}


	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}
}
