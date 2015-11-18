package org.command.pattern.classes;

public class Stereo {
	private String name;
	private String type;
	
	public Stereo(String name) {
		this.name = name;
		this.type = "Stereo";
	}
	
	public void on(){
		System.out.println(this.type + " " + this.name +" On");
	}
	
	public void off(){
		System.out.println(this.type + " " + this.name + " Off");
	}
	
	public void setCD(){
		System.out.println("CD Set");
	}
	
	public void setDVD(){
		System.out.println("DVD set");
	}
	
	public void setRadio(){
		System.out.println("Radio set");
	}
	
	public void setVolume(int volume){
		System.out.println("Volume set at " + volume);
	}

}
