package org.name.pattern.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.name.pattern.abstracts.CoffeinBeverage;

public class Coffee extends CoffeinBeverage {

	public Coffee() {
		// TODO Auto-generated constructor stub
	}
	

	public void brew(){
		System.out.println("Coffe grinds are being brewed");
	}
	
	public void addCondiment() {
		System.out.println("Adding sugar and milk");
	}
	
	public boolean customerWantsCondiment(){
		String answer = this.getUserInput();
		
		if (answer.toLowerCase().startsWith("y")){
			return true;
		} else {
			return false;
		}
	}
	private String getUserInput(){
		String answer = null;
		System.out.println("Would you like milk and sugar with the coffee? (y/n)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		}catch (IOException e) {
			System.err.println("IO error trying to read your answer");
			
		}
		
		if (answer == null){
			return "no";
		}
		
		return answer;
	}
}
