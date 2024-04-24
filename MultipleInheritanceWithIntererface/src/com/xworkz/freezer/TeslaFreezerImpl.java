package com.xworkz.freezer;

public class TeslaFreezerImpl implements Freezer,LgFreezer,SamasungFreezer,TeslaFreezer{

	@Override
	public void autoCool() {
		System.out.println("this is teslaFreezer autocool");
		return;
	}

	

}
