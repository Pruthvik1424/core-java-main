package com.xworkz.exceptionrunner;

import com.xworkz.exception.PhoneNo;
import com.xworkz.exception.inValidPhoneNoException;

public class PhoneRunner {

	public static void main(String[] args) throws inValidPhoneNoException {
		
		PhoneNo num = new PhoneNo();
		try {
		num.call(963289080);
		}
		catch(inValidPhoneNoException e) {
			e.printStackTrace();
			System.out.println("invalid phone number");
		}

	}

}
