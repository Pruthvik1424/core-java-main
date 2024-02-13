package com.xworkz.snacks;

public class Eatchips {
	
	public void runChips(hotChips hotchips ) {
		
		System.out.println(hotchips.type);
		hotchips.eat();
		
		
		if (hotchips instanceof saltChips) {
			saltChips saltchips =(saltChips)hotchips;
			saltchips.taste();
			System.out.println(saltchips.madeby);
		}
		
		if(hotchips instanceof Lace) {
			Lace lace =(Lace)hotchips;
			lace.madeby();
			System.out.println(lace.brand);
		}
		if (hotchips instanceof saltChips) {
			saltChips saltchips = (saltChips)hotchips;
			saltchips.taste();
			System.out.println(saltchips.madeby);
		}
		if (hotchips instanceof spicyChips) {
			spicyChips spicychips = (spicyChips)hotchips;
			spicychips.taste();
			System.out.println(spicychips.type);
		}
		if (hotchips instanceof saltAndSpicyChips) {
			saltAndSpicyChips saltandspicychips =(saltAndSpicyChips)hotchips;
			saltandspicychips.oily();
			System.out.println(saltandspicychips.mixing);
		}
	}

}
