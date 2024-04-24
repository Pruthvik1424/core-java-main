package com.xworkz.funcass;

import com.xworkz.func.BiFunctionCheck;

public class BiFunctionRunner {

	public static void main(String[] args) {
		BiFunctionCheck fun = new BiFunctionCheck((String S, Integer i)->false);
		fun.check();
	}

}
