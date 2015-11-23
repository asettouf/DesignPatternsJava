package org.name.pattern.classes;

import org.name.pattern.abstracts.Quackable;

public class DuckCall implements Quackable {

	@Override
	public void quack() {
		System.out.println("Kwack");
	}

}
