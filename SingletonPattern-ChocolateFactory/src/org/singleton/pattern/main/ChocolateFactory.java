package org.singleton.pattern.main;

import org.singleton.pattern.classes.ChocolateBoiler;

public class ChocolateFactory {

	public static void main(String[] args) {
		ChocolateBoiler cb = ChocolateBoiler.getInstance();
		cb.fill();
		cb.boil();
		cb.drain();

	}

}
