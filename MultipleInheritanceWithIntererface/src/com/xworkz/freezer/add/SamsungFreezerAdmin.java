package com.xworkz.freezer.add;

import com.xworkz.freezer.SamasungFreezer;

public class SamsungFreezerAdmin {

	private SamasungFreezer samsunFreezer;
	
	public SamsungFreezerAdmin(SamasungFreezer samsunFreezer) {
		this.samsunFreezer= samsunFreezer;
	}
	
	public void autoCool() {
		if(samsunFreezer!=null) {
			System.out.println("autocool in samsung freezer");
		}else {
			System.out.println("no autocool in samsungfreezer");
		}
	}
}
