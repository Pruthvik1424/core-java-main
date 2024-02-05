package com.xworkz.accessSpecifiers;

//import com.xworkz.accessSpecifier.add.Dog;
//import com.xworkz.accessSpecifier.add.Cow;
import com.xworkz.accessSpecifier.add.Snake;
//import com.xworkz.accessSpecifier.add.Tiger;

public class accessRunner {
	
	
	Snake snake=new Snake();
	
	
	

	public static void main(String[] args) {
		
		// public wit constructors
		Snake snake = new Snake();
		System.out.println(snake);
		
		// here package default access specifier will not allow to use new key word 
//		Cow cow = new Cow();
//		System.out.println(cow);
		
		
		// here Protected access specifier will not allow to use new key word 
//		Tiger tiger =new Tiger();
//		System.out.println(tiger);
		
		//here Private access specifier will not allow to use new key word 
//		Dog dog =new Dog();
//		System.out.println(dog);

	}

}
