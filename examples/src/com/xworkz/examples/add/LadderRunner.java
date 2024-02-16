package com.xworkz.examples.add;

import com.xworkz.examples.Ladder;

public class LadderRunner {

	public static void main(String[] args) {
		Ladder ladder1=new Ladder();
		ladder1.brand="Bathla";
		ladder1.loadCapacity="95kg";
		ladder1.material="	Aluminium";
		ladder1.price=3000;
		ladder1.weight="1500grams";
		ladder1.specialFeature="Foldable";
		
		Ladder ladder2=new Ladder();
		ladder2.brand="Bathla";
		ladder2.loadCapacity="95kg";
		ladder2.material="	Aluminium";
		ladder2.price=3000;
		ladder2.weight="1500grams";
		ladder2.specialFeature="Foldable";
		
		
		Ladder ladder3=new Ladder();
		ladder3.brand="Bathla";
		ladder3.loadCapacity="95kg";
		ladder3.material="	Aluminium";
		ladder3.price=3000;
		ladder3.weight="1500grams";
		ladder3.specialFeature="Foldable";
		
		
		boolean result1=ladder1.equals(ladder2);
		System.out.println(result1);
		System.out.println("----------------------------");
		
		boolean result2=ladder1.equals(ladder3);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		boolean result3=ladder2.equals(ladder3);
		System.out.println(result3);


	}

}
