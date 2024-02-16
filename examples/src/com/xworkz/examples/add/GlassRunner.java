package com.xworkz.examples.add;

import com.xworkz.examples.Glass;

public class GlassRunner {

	public static void main(String[] args) {
		Glass glass1=new Glass();
		glass1.brand="Yera";
		glass1.materialType="glass";
		glass1.occasion="Party";
		glass1.price=100;
		glass1.shape="Tumblers";
		glass1.style="Epitome";
		
		Glass glass2=new Glass();
		glass2.brand="Yera";
		glass2.materialType="glass";
		glass2.occasion="Party";
		glass2.price=100;
		glass2.shape="Tumblers";
		glass2.style="Epitome";
		
		Glass glass3=new Glass();
		glass3.brand="Borosil";
		glass3.materialType="steel";
		glass3.occasion="Party";
		glass3.price=150;
		glass3.shape="Tumblers";
		glass3.style="Epitome";
		
		boolean result1=glass1.equals(glass2);
		System.out.println(result1);
		System.out.println("----------------------------");
		
		boolean result2=glass1.equals(glass3);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		boolean result3=glass2.equals(glass3);
		System.out.println(result3);
	}

}
