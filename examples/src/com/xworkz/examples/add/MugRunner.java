package com.xworkz.examples.add;

import com.xworkz.examples.Mug;

public class MugRunner {

	public static void main(String[] args) {
		Mug mug1=new Mug();
		mug1.brand="Clay Craft";
		mug1.materialType="Clay";
		mug1.color="Brown";
		mug1.price=50;
		mug1.shape="cone shape";
		mug1.type="Coffee mug";
		
		Mug mug2=new Mug();
		mug2.brand="Clay Craft";
		mug2.materialType="Clay";
		mug2.color="Brown";
		mug2.price=50;
		mug2.shape="cone shape";
		mug2.type="Coffee mug";
		
		Mug mug3=new Mug();
		mug3.brand="Clay Craft";
		mug3.materialType="Clay";
		mug3.color="Brown";
		mug3.price=50;
		mug3.shape="cone shape";
		mug3.type="Coffee mug";
		
		boolean result1=mug1.equals(mug2);
		System.out.println(result1);
		System.out.println("----------------------------");
		
		boolean result2=mug1.equals(mug3);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		boolean result3=mug2.equals(mug3);
		System.out.println(result3);

	}

}
