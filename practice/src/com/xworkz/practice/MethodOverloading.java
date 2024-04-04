package com.xworkz.practice;

public class MethodOverloading {
//	class having same name and diff paraameters or arguments
	// during overloading returntype are same or different
	// we can do method overloading for both static and non static methods as well
	//even main method also overloaded but execution is always start from which method having string[](string array)
	// in java we cannot have nested method but in one method we can call or invoke another method 
//	static method -> we can access using calss name 
//	non static method -> we can access usimg ref of object creation
	
	public static int a =10;
	public  int b = 12;
	
	public String Display(String name) {
		System.out.println("method overloading");
		return name;
		
	}
	public void Display(int rate) {
		this.Display("smasung", 10000);
		System.out.println("Display");
	}
}
