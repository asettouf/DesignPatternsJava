package org.builder.pattern.abstracts;

import org.builder.pattern.entities.Direction;

public abstract class MapSite {
	protected Direction dir;
	public abstract void enter();
	public void setDirection(Direction direction){
		this.dir = direction;
	}
	public Direction getDirection(){
		return this.dir;
	}

}
