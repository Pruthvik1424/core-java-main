package com.xworkz.single.add;

import com.xworkz.single.Cake;
import com.xworkz.single.Eatcake;
import com.xworkz.single.Pastry;

public class Cakerunner {

	public static void main(String[] args) {
	
	 Eatcake eatcake = new Eatcake();
	 
	 Cake cake = new Cake();
	 eatcake.runCake(cake);
	 
	 
	 Pastry pastry = new Pastry();
	 eatcake.runCake(pastry);
	 

	}

}
