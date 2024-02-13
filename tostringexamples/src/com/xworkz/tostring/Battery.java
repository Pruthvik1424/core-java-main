package com.xworkz.tostring;

public class Battery {
      
	public String having ="capacitor";
	public String capacity = "1000w";
	public String price = "1500rs";
	
	@Override
	public String toString() {
		System.out.println("having :"+having +"capacit :" +capacity +"price :"+price);
		return super.toString();
	}
	
}
