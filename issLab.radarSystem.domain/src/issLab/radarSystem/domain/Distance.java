package issLab.radarSystem.domain;

import issLab.radarSystem.domain.interfaces.IDistance;

public class Distance implements IDistance{
	private int v;

	public Distance(int d) {
		v=d;
	}

	public Distance(String d) {
		v=Integer.parseInt(d);
	}

	@Override
	public int getVal() {
		return v;
	}
	    
	@Override
	public String toString() {
		return ""+v;
	}
}
