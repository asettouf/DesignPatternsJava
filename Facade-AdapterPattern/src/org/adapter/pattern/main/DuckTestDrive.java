package org.adapter.pattern.main;

import org.adapter.pattern.abstracts.Duck;
import org.adapter.pattern.classes.MallardDuck;
import org.adapter.pattern.classes.TurkeyAdapter;
import org.adapter.pattern.classes.WildTurkey;

public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("The Duck says...");
		testDuck(duck);
		
		System.out.println("The TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
	
	public static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}
