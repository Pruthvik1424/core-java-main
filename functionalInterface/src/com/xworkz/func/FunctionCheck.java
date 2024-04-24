package com.xworkz.func;

import java.util.function.Function;

public class FunctionCheck {
private Function<String,Integer> function;
	
	public FunctionCheck(Function<String,Integer> function) {
		this.function = function;
		
	}
	
	public void check() {
		System.out.println("running check in functioncheck");
		Integer value = this.function.apply("Run");
		if(value != null) {
			System.out.println("apply");
		}else {
			System.out.println("not apply");
		}
	}
}
