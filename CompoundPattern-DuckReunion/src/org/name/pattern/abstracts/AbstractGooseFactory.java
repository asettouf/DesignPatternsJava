package org.name.pattern.abstracts;

import org.name.pattern.classes.Goose;

public abstract class AbstractGooseFactory {
	
	public abstract Goose createGoose();
	public abstract Quackable createGooseAdapter(Goose goose);
}
