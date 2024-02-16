package com.xworkz.examples.add;

import com.xworkz.examples.Lace;

public class LaceRunner {

	public static void main(String[] args) {
		Lace lace = new Lace();
		lace.brand="LOCK LACES";
		lace.color="yellow";
		lace.material="cotton";
		lace.length=120;
		lace.meter=9;
		lace.price=100;
		
		Lace lace1 = new Lace();
		lace1.brand="LOCK LACES";
		lace1.color="yellow";
		lace1.material="cotton";
		lace1.length=120;
		lace1.meter=9;
		lace1.price=100;
		
		Lace lace2 = new Lace();
		lace2.brand="Lify";
		lace2.color="white";
		lace2.material="ployster";
		lace2.length=100;
		lace2.meter=12;
		lace2.price=200;
		
		boolean la=lace.equals(lace1);
		System.out.println(la);
		
		boolean la1 =lace.equals(lace2);
		System.out.println(la1);
		
		boolean la2 =lace1.equals(lace2);
		System.out.println(la2);

	}

}
