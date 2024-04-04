package com.xworkz.exception;

public class Throwball extends Exception {

	private static final long serialVersionUID = 1L;
	
	public Throwball() {
		
	}
	public Throwball(String msg) {
		super(msg);
	}
	public void Ball() throws Throwball {
		throw new Throwball("exception in throw ball");
	}

}
