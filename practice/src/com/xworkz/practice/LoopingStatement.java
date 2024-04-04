package com.xworkz.practice;

public class LoopingStatement {

	public static void main(String[] args) {
		
		for(int i = 1 ; i<11 ; i ++) {
			System.out.println("count is :" + i);
			System.out.println("@@@@@@@@@@@@@@@@@@@");
		}
		
		// enhanced for loop
		// it is used to itarates through the collection or arrays
		
		int[] count = {1,2,3,4,5,6};
		for(int count1 : count) {
			System.out.println("count is :" +count1);
			System.out.println("#####################");
		}
	}

}
