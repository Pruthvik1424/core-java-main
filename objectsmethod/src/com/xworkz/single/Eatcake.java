package com.xworkz.single;

public class Eatcake {
        public void runCake(Cake cake) {
        	
        	System.out.println(cake.breadtype);
        	cake.eat();
        	
        	if(cake instanceof Pastry) {
        		Pastry pastry =(Pastry)cake;
        		pastry.Cream();
        		System.out.println(pastry.flavour);
        	}
        }
}
