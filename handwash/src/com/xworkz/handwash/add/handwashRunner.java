package com.xworkz.handwash.add;

import com.xworkz.handwash.Handwash;
import com.xworkz.handwash.Handwasher;
import com.xworkz.handwash.Lux;
import com.xworkz.handwash.Sanitizer;
import com.xworkz.handwash.Soap;

public class handwashRunner {

	public static void main(String[] args) {
		
		Handwasher handwasher = new Handwasher();
		
		Handwash handwash =new Handwash();
		handwasher.runHandwash(handwash);
//		handwasher.runLux(null);           ->null pointer exception
//		handwasher.runSanitizer(null);
//		handwasher.runSoap(null);
		System.out.println("******************");
		
		Soap soap =new Soap();
		handwasher.runSoap(soap);
		handwasher.runHandwash(handwash);
//		handwasher.runLux(null);
//		handwasher.runSanitizer(null);
		System.out.println("**********************");
		
		Lux lux = new Lux();
		handwasher.runHandwash(handwash);
		handwasher.runLux(lux);
		handwasher.runSoap(soap);
//		handwasher.runSanitizer(null);
		System.out.println("***********************");
		
		
		Sanitizer sanitizer = new Sanitizer();
	    handwasher.runHandwash(handwash);
		handwasher.runSanitizer(sanitizer);
		handwasher.runSoap(soap);                             // ->doubt
//		handwasher.runLux(null);
		
		

	}

}
