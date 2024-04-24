package com.xworkz.func;

import java.util.function.BiConsumer;

public class BiconsumerAssociation {

private BiConsumer<String,Integer> biconsumer;
	
	public BiconsumerAssociation(BiConsumer<String,Integer> biconsumer) {
		this.biconsumer = biconsumer;
		
	}
	
	public void check() {
		System.out.println("running check in biconsumerAssociation");
		 value = this.biconsumer.accept("Rainy", 10);
		
	}
	
}
