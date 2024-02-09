package com.xwokz.animals.add;

import com.xworkz.animals.Lion;
import com.xworkz.animals.Tiger;
import com.xworkz.animals.Wildanimals;

public class Animalsrunner {

	public static void main(String[] args) {
		
		Wildanimals wildanimals = new Wildanimals();
		
		
		Tiger tiger = new Tiger();
	    wildanimals.runTiger(tiger);
	    System.out.println("_______________________");
	    
	    Lion lion1 = new Lion();
	    wildanimals.runLion(lion1);
	    System.out.println("_______________________");
	    
	    

	}

}
