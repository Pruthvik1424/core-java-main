package com.xworkz.tostring;

public class Tie {
    public String cloth ="fabric";
    public String price ="100rs";
    public String color ="black";
    
    @Override
    public String toString() {
    	System.out.println("Cloth is :"+cloth + "price :"+ price +"color :"+color);
    	return super.toString();
    }
}
