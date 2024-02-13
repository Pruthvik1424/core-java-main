package com.xworkz.snacks.add;

import com.xworkz.snacks.Eatchips;
import com.xworkz.snacks.Lace;
import com.xworkz.snacks.hotChips;
import com.xworkz.snacks.saltAndSpicyChips;
import com.xworkz.snacks.saltChips;
import com.xworkz.snacks.spicyChips;

public class Chipsrunner {

	public static void main(String[] args) {
		
		Eatchips eatchips = new Eatchips();
		
		hotChips hotchips = new hotChips();
		eatchips.runChips(hotchips);
		
		Lace lace = new Lace();
		eatchips.runChips(lace);
		
		saltAndSpicyChips saltandspicychips = new saltAndSpicyChips();
		eatchips.runChips(saltandspicychips);
		
		saltChips saltchips = new saltChips();
		eatchips.runChips(saltchips);
		
		spicyChips spicychips = new spicyChips();
		eatchips.runChips(spicychips);

	}

}
