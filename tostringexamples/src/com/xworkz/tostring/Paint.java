package com.xworkz.tostring;

public class Paint {
   public String color = "red";
   public String madeby = "arecanut";
   public String price = "500rs";
   
   @Override
	public String toString() {
		System.out.println("color :"+color +"madeby :"+madeby + "price :"+price);
		return super.toString();
	}
}
