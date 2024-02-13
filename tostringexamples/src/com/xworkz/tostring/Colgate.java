package com.xworkz.tostring;

public class Colgate {
	public int price = 20;
	public String Brand = "collgate";
	public String manufactureDate = "feb 01 2023";
	
	@Override
	public String toString() {
		System.out.println("price :"+ price + "Brand :"+Brand +" manufactureDate :"+ manufactureDate);
		return super.toString();
	}
}
