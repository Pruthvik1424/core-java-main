package com.xworkz.funcInterfaceRunner;

import com.xworkz.funcInterface.BloodGroup;

public class BloodGroupRunner {
	 public static void main(String[] args) {
	        BloodGroup bloodGroup = () -> {
	           
	            return true; 
	        };

	        boolean compatible = bloodGroup.isCompatible();
	        System.out.println("Is blood group compatible : " + compatible);
	    }
}
