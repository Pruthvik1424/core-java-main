package com.xworkz.tostring.add;

import com.xworkz.tostring.Belt;

public class BeltRunner {

	public static void main(String[] args) {
		Belt belt1 = new Belt();
	    System.out.println(belt1);
	    
	    
		
		Belt b1 = new Belt();
		b1.length=120;
		b1.type="dog";
		b1.price=200;
		b1.material="cloth";
		
		boolean same = belt1.equals(b1);
		System.out.println(same);

	}

}
