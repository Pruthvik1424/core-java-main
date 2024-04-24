package com.xworkz.func;

import java.util.function.Predicate;

public class PredicateCheck {

private Predicate<String> predicate;
	
	public public PredicateCheck(Predicate<String>) {
		this.predicate= predicate;
		
	}
	
	public void check() {
		System.out.println("running check in PridicateCheck");
		boolean value = this.predicate("sweet");
		if(value) {
			System.out.println("prepared");
		}else {
			System.out.println("not prepared");
		}
	}
}
