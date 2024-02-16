package com.xworkz.examples.add;

import com.xworkz.examples.Stand;

public class StandRunner {

	public static void main(String[] args) {
		Stand stand1=new Stand();
		stand1.brand="amazon basics";
		stand1.materialType="wood and steel";
		stand1.color="white";
		stand1.price=1500;
		stand1.shape="rectangle";
		stand1.catagory="Home & Kitchen";
		
		Stand stand2=new Stand();
		stand2.brand="amazon basics";
		stand2.materialType="wood and steel";
		stand2.color="white";
		stand2.price=1500;
		stand2.shape="rectangle";
		stand2.catagory="Home & Kitchen";
		
		Stand stand3=new Stand();
		stand3.brand="amazon basics";
		stand3.materialType="wood and steel";
		stand3.color="white";
		stand3.price=1500;
		stand3.shape="rectangle";
		stand3.catagory="Home & Kitchen";
		
		boolean result1=stand1.equals(stand2);
		System.out.println(result1);
		System.out.println("----------------------------");
		
		boolean result2=stand1.equals(stand3);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		boolean result3=stand2.equals(stand3);
		System.out.println(result3);

	}

}
