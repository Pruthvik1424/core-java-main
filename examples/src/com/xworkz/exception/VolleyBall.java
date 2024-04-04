package com.xworkz.exception;

public class VolleyBall extends Exception{

	private static final long serialVersionUID = 1L;
	
	public VolleyBall() {
		
	}
	public VolleyBall(String name) {
		super(name);
	}
	public void Ball() throws VolleyBall {
		throw new VolleyBall("exception in volleyball");
		
	}

}
