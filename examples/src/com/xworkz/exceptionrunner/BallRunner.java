package com.xworkz.exceptionrunner;

import com.xworkz.exception.Throwball;
import com.xworkz.exception.VolleyBall;

public class BallRunner {

	public static void main(String[] args) throws Throwball {
		
		
		try {
			VolleyBall b1 = new VolleyBall();
			Throwball b2 = new Throwball();
			b1.Ball();
			b2.Ball();
		}
		catch(Throwball| VolleyBall  e) {
			e.printStackTrace();
			System.err.println("throw error in volly");
		}

	}

}
