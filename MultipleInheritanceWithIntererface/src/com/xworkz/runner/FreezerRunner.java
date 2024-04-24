package com.xworkz.runner;

import com.xworkz.freezer.Freezer;
import com.xworkz.freezer.LgFreezer;
import com.xworkz.freezer.SamasungFreezer;
import com.xworkz.freezer.TeslaFreezer;
import com.xworkz.freezer.TeslaFreezerImpl;
import com.xworkz.freezer.add.FreezerAdmin;
import com.xworkz.freezer.add.LgFreezerAdmin;
import com.xworkz.freezer.add.SamsungFreezerAdmin;

public class FreezerRunner {

	public static void main(String[] args) {
		
	Freezer auto = new TeslaFreezerImpl();
//	auto.autoCool();
	
	
//	
	LgFreezer lgAuto = new TeslaFreezerImpl();
	LgFreezerAdmin lg = new LgFreezerAdmin(lgAuto);
	lg.autoCool();
	
	SamasungFreezer samAuto = new TeslaFreezerImpl();
	SamsungFreezerAdmin sam = new SamsungFreezerAdmin(samAuto);
	sam.autoCool();
	
//	TeslaFreezer tesAuto = new TeslaFreezerImpl();
//    FreezerAdmin tes = new FreezerAdmin(tesAuto);
//    tes.autoCool();

	}

}
