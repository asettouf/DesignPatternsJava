package org.name.pattern.classes;

import org.name.pattern.abstracts.Quackable;

public class GooseAdapter implements Quackable {
	protected Goose goose;
	
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}


	@Override
	public void quack() {
		this.goose.honk();
	}

}
