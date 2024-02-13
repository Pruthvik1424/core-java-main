package com.xworkz.tostring;

public class Ring {
   public String Material ="gold";
   public int price = 6000;
   public String type = "24carrat";
   
   @Override
	public String toString() {
		System.out.println("material :"+Material + "price :"+price + "type :"+type);
		return super.toString();
	}
}
