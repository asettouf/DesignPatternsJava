package org.command.pattern.classes;

public class CeilingFan {
	private String name;
	private String type;
	
	public CeilingFan(String name) {
		this.name = name;
		this.type = "Ceiling Fan";
	}

	public void on(){
		System.out.println(this.type + " " + this.name + "On");
	}
	
	public void off(){
		System.out.println(this.type + " " + this.name + "Off");
	}

}
