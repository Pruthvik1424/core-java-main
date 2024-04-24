package com.xworkz.funcInterfaceRunner;

import com.xworkz.funcInterface.FestivalCheck;

public class FestivalRunner {

	public static void main(String[] args) {
		
		FestivalCheck check = new FestivalCheck((item,buy)->true);
		check.check();
		System.out.println("this is main method");
	}

}
