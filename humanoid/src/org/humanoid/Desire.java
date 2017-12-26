package org.humanoid;

public abstract class Desire {
	private int priority;
	public void setPriority(int priority) {
		this.priority=priority;
	}
	public int getPriority() {
		return priority;
	}
	
	
	public abstract Good toRelease(Resource res);
	
	

}
