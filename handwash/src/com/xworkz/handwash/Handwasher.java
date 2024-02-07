package com.xworkz.handwash;

public class Handwasher {
      
	public void runHandwash(Handwash handwash) {
		
		System.out.println(handwash.aroma);
		handwash.clean();
		
		
//		casting.........
		if(handwash instanceof Handwash) {
			Handwash handwash1 =(Handwash)handwash;
			System.out.println(handwash1.aroma);
			handwash1.clean();
		}
		else if(handwash instanceof Soap) {
			Soap soap = (Soap)handwash;
			System.out.println(soap.brand);
			soap.foam();
			
			if(handwash instanceof Lux) {
				Lux lux = (Lux)handwash;
				System.out.println(lux.price);
				lux.makeYoung();
			}
		}
		if(handwash instanceof Sanitizer) {
			Sanitizer sanitizer = (Sanitizer)handwash;
			System.out.println(sanitizer.quantity);
			sanitizer.disinfect();
		}
	}
	
	public void runSanitizer(Sanitizer sanitizer) {
		System.out.println(sanitizer.quantity);
		sanitizer.disinfect();
		if (sanitizer instanceof Sanitizer) {
			Sanitizer sanitizer1 = (Sanitizer)sanitizer;
			sanitizer1.disinfect();
			System.out.println(sanitizer1.quantity);
		}
		if(sanitizer instanceof Handwash) {
			Handwash handwash2 = (Handwash)sanitizer;
			System.out.println(handwash2.aroma);
			handwash2.clean();
		}
	}
	
	public void runSoap(Soap soap) {
		System.out.println(soap.brand);
		soap.foam();
		
		if (soap instanceof Soap) {
			Soap soap1 = (Soap)soap;
//			System.out.println(soap1.foam());
			soap1.foam();
			
		}
		
		else if (soap instanceof Lux) {
			Lux lux = (Lux)soap;
			System.out.println(lux.price);
			lux.makeYoung();
		}
		else if(soap instanceof Handwash) {
			Handwash handwash3 = (Handwash)soap;
			System.out.println(handwash3.aroma);
			handwash3.clean();
		}
	}
	public void runLux(Lux lux) {
		System.out.println(lux.price);
		lux.makeYoung();
		
		if(lux instanceof Handwash) {
			Handwash handwash = (Handwash)lux;
			handwash.clean();
			System.out.println(handwash.aroma);
		}
		else if (lux instanceof Soap) {
			Soap soap = (Soap)lux;
			soap.foam();
			System.out.println(soap.brand);
		}
	}
}
