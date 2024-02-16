package com.xworkz.examples.add;

import com.xworkz.examples.Fan;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan1=new Fan();
		fan1.brand="amazon basics";
		fan1.type="electric";
		fan1.color="black";
		fan1.price=3000;
		fan1.noOfWings=3;
		fan1.catagory="remote";
		
		Fan fan2=new Fan();
		fan2.brand="amazon basics";
		fan2.type="electric";
		fan2.color="black";
		fan2.price=3000;
		fan2.noOfWings=3;
		fan2.catagory="remote";
		
		Fan fan3=new Fan();
		fan3.brand="amazon basics";
		fan3.type="electric";
		fan3.color="black";
		fan3.price=3000;
		fan3.noOfWings=3;
		fan3.catagory="remote";
		
		boolean result1=fan1.equals(fan2);
		System.out.println(result1);
		System.out.println("----------------------------");
		
		boolean result2=fan1.equals(fan3);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		boolean result3=fan2.equals(fan3);
		System.out.println(result3);


	}

}
