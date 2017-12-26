package org.humanoid;
import java.util.LinkedList;

public class DesireManager {
	private LinkedList<Desire> lld=new LinkedList();
	private Strategy str;
	
	public void run(){
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				lld.add(new Desire());			
			}
			chooseDesireToRealease(lld,str).releaseMyself().Hi();
		}
		
	}

	private Desire chooseDesireToRealease(LinkedList<Desire> lld,Strategy st) {
		
		return(lld.remove());
	}
	
 
	

}
