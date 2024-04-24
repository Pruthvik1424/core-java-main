package com.xworkz.funcInterfaceRunner;

import com.xworkz.funcInterface.Chacolate;

public class ChocolateRunner {
public static void main(String[] args) {
		
		Chacolate choco=()->System.out.println("Running eat method in choco");
        choco.eat();
	}
}
