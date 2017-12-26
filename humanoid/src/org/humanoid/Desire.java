package org.humanoid;

public class Desire {
	private int priority;
	public void setPriority(int priority) {
		this.priority=priority;
	}
	public int getPriority() {
		return priority;
	}
	
	
	public Good releaseMyself() {
		return burn(new Behavior().doB().pressureOnRelation());
	};
	
	private Good burn(Resource rs) {	
		return new Good();
	}
	
	

}
