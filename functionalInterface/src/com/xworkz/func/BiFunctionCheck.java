package com.xworkz.func;

import java.util.function.BiFunction;

public class BiFunctionCheck {
	
private BiFunction<String,Integer, Boolean> bifunction;
	
	public BiFunctionCheck(BiFunction<String,Integer, Boolean> bifunction) {
		this.bifunction = bifunction;
		
	}
	
	public void check() {
		System.out.println("running check in bifunctioncheck");
		boolean value = this.bifunction.apply("Rainy", 10);
		if(value) {
			System.out.println("apply");
		}else {
			System.out.println("not apply");
		}
	}

}
