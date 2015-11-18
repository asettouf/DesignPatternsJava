package org.command.pattern.classes;

public class Light {
	private String name;
	private String type;
	
	public Light(String name) {
		this.name = name;
		this.type = "Light";
	}
	
	public void on(){
		System.out.println(this.type + " " + this.name + " is on");
	}
	
	public void off(){
		System.out.println(this.type + " " + this.name + " is off");
	}


}
