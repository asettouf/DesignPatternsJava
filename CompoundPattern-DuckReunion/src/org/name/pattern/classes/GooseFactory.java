package org.name.pattern.classes;

import org.name.pattern.abstracts.AbstractGooseFactory;
import org.name.pattern.abstracts.Quackable;

public class GooseFactory extends AbstractGooseFactory {

	@Override
	public Goose createGoose() {
		return new Goose();
	}

	@Override
	public Quackable createGooseAdapter(Goose goose) {
		return new GooseAdapter(goose);
	}

}
