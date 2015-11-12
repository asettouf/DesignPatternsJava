package org.design.main;

import org.design.pattern.*;
public class MiniDuckSim {

	public static void main(String[] args) {
		/*Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();*/
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		
		model.setFlyBehavior(new FlyWithRockets());
		
		model.performFly();

	}

}
