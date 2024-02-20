package com.xworkz.examples.add;

import com.xworkz.examples.Belt;

public class BeltRunner {

	public static void main(String[] args) {
		Belt b = new Belt();
		b.length=120;
		b.type="weist";
		b.price=100;
		b.material="leather";
		
		Belt b1 = new Belt();
		b1.length=120;
		b1.type="weist";
		b1.price=100;
		b1.material="leather";
		
		Belt b2 = new Belt();
		b2.length=30;
		b2.type="abc";
		b2.price=50;
		b2.material="plastic";
		
		boolean bel =b.equals(b1);
		System.out.println(bel);
		
		boolean bel1 =b.equals(b2);
		System.out.println(bel1);
		
		boolean bel2 =b1.equals(b2);
		System.out.println(bel2);

	}

}
