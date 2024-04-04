package com.xworkz.exception;

public class PhoneNo  {
	
	public void call(long num) throws inValidPhoneNoException {
		if (num<=10) {
			System.out.println("phone number is valid");
			
		}
		else 
		throw new inValidPhoneNoException("number is invalid");
	}

}
