package com.xworkz.practice;

public class Method1 {
	public Method1() {
		System.out.println("Running no param const....");
	}
    public void Display() {
    	System.out.println("hellow method");
    }
//    methods with arguments and without return type (void)
    public void Display1(int a, int b) {
    	System.out.println(a+b);
    }
//    methods with no arguments and with return type
    public String Display2(String name) {
    	return name;
    }
//    methods with arguments and with return type
    public int Display3(int a) {
    	return a*a;
    }
}
