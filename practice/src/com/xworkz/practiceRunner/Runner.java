package com.xworkz.practiceRunner;

import com.xworkz.practice.Method1;

public class Runner {
    
	public static void main(String[] args) {
		Method1 d = new Method1();
		d.Display();
		System.out.println(d);
		d.Display1(2, 3);
		System.out.println(d.Display2("pruthvik"));
		System.out.println(d.Display3(5));
//		methods will execute whenever it is called or invoking;
	
	}

}
