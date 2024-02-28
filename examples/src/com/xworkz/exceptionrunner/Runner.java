package com.xworkz.exceptionrunner;

import com.xworkz.exception.InValidTicketNoException;
import com.xworkz.exception.Movie;

public class Runner {

	public static void main(String[] args) {
		Movie mv = new Movie();
		try {
			mv.display(4999);
		} catch (InValidTicketNoException e) {
			e.printStackTrace();
			System.err.println("invalid ticket");
		}

	}

}
