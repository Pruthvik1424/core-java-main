package com.xworkz.freezer.add;

import com.xworkz.freezer.LgFreezer;

public class LgFreezerAdmin {

	private LgFreezer lgFreezer;
	
	public LgFreezerAdmin(LgFreezer lgFreezer) {
		this.lgFreezer=lgFreezer;
	}
	public void autoCool() {
		if(lgFreezer!=null) {
			System.out.println("autocool in lgFreezer");
		}else {
			System.out.println("No autocool in lg");
		}
	}
	
}
