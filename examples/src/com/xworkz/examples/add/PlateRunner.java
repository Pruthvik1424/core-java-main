package com.xworkz.examples.add;

import com.xworkz.examples.Plate;

public class PlateRunner {

	public static void main(String[] args) {
		Plate plate1=new Plate();
		plate1.brand="Signoraware";
		plate1.type="Ancle";
		plate1.material="steel";
		plate1.price=350;
		plate1.shape="round";
		plate1.ocasion="Anniversary";
		
		Plate plate2=new Plate();
		plate2.brand="Signoraware";
		plate2.type="Ancle";
		plate2.material="steel";
		plate2.price=350;
		plate2.shape="round";
		plate2.ocasion="Anniversary";
		
		Plate plate3=new Plate();
		plate3.brand="Signoraware";
		plate3.type="Ancle";
		plate3.material="steel";
		plate3.price=350;
		plate3.shape="round";
		plate3.ocasion="Anniversary";
		
		boolean result1=plate1.equals(plate2);
		System.out.println(result1);
		System.out.println("----------------------------");
		
		boolean result2=plate1.equals(plate3);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		boolean result3=plate2.equals(plate3);
		System.out.println(result3);


	}

}
