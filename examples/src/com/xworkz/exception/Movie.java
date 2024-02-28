package com.xworkz.exception;

public class Movie {
	public void display(int ticketNo) throws InValidTicketNoException {
		if(ticketNo>0 && ticketNo<5000) {
			System.out.println("valid ticket");
		}
		else 
			throw new InValidTicketNoException();
	}

}
