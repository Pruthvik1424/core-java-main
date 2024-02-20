package com.xworkz.encapsulation.add;

import com.xworkz.encapsulation.Box;

public class BoxRunner {

	public static void main(String[] args) {
	 
		Box b = new Box();
		b.setShape("round");
		System.out.println(b.getShape());
		b.setPrice(250);
		System.out.println(b.getPrice());
		b.setCapacity("500ml"); 
		System.out.println(b.getCapacity());
		
		Box b1 = new Box();
		b1.setCapacity("250ml");
		System.out.println(b1.getCapacity());
		b1.setPrice(300);
		System.out.println(b1.getPrice());
		b1.setShape("rectangle");
		System.out.println(b1.getShape());
		
		b.equals(b1);
		boolean obj1 = b.equals(b1);
		System.out.println(obj1);
		
		
	}

}
