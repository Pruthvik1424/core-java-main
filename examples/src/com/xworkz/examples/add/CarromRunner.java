package com.xworkz.examples.add;

import com.xworkz.examples.Carrom;

public class CarromRunner {

	public static void main(String[] args) {
		Carrom carrom1=new Carrom();
		carrom1.brand="KORNERS";
		carrom1.color="brown and black";
		carrom1.noOfPlayers=4;
		carrom1.price=2000;
		carrom1.shape="rectangle";
		carrom1.genre="Sports";
		
		Carrom carrom2=new Carrom();
		carrom2.brand="KORNERS";
		carrom2.color="brown and black";
		carrom2.noOfPlayers=4;
		carrom2.price=2000;
		carrom2.shape="rectangle";
		carrom2.genre="Sports";
		
		
		Carrom carrom3=new Carrom();
		carrom3.brand="KORNERS";
		carrom3.color="brown and black";
		carrom3.noOfPlayers=4;
		carrom3.price=2000;
		carrom3.shape="rectangle";
		carrom3.genre="Sports";
		
		
		boolean result1=carrom1.equals(carrom2);
		System.out.println(result1);
		System.out.println("----------------------------");
		
		boolean result2=carrom1.equals(carrom3);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		boolean result3=carrom2.equals(carrom3);
		System.out.println(result3);


	}

}
