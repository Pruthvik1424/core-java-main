package com.xworkz.examples.add;

import com.xworkz.examples.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		Shoe shoe1=new Shoe();
		shoe1.brand="puma";
		shoe1.type="mens";
		shoe1.material="mesh";
		shoe1.price=1500;
		shoe1.size='m';
		shoe1.catagory="Running Shoe";
		
		Shoe shoe2=new Shoe();
		shoe2.brand="puma";
		shoe2.type="mens";
		shoe2.material="mesh";
		shoe2.price=1500;
		shoe2.size='m';
		shoe2.catagory="Running Shoe";
		
		Shoe shoe3=new Shoe();
		shoe3.brand="puma";
		shoe3.type="mens";
		shoe3.material="mesh";
		shoe3.price=1500;
		shoe3.size='m';
		shoe3.catagory="Running Shoe";
		
		boolean result1=shoe1.equals(shoe2);
		System.out.println(result1);
		System.out.println("----------------------------");
		
		boolean result2=shoe1.equals(shoe3);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		boolean result3=shoe2.equals(shoe3);
		System.out.println(result3);

	}

}
