package com.xworkz.freezer.add;

import com.xworkz.freezer.SamasungFreezer;
import com.xworkz.freezer.TeslaFreezer;

public class FreezerAdmin {

	private TeslaFreezer teslaFreezer;
	
	public FreezerAdmin(TeslaFreezer teslaFreezer) {
		this.teslaFreezer = teslaFreezer;
	}
	
	public void autoCool() {
		if(teslaFreezer!=null) {
			System.out.println("Teslafreezer is auto cool");
		}else {
			System.err.println("TeslaFreezer is not autocool");
		}
	}
	
	
		

}
