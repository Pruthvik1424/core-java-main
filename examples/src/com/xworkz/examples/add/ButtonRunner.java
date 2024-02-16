package com.xworkz.examples.add;

import com.xworkz.examples.Button;

public class ButtonRunner {

	public static void main(String[] args) {
		Button button = new Button();
		button.shape="round";
		button.material="plastic";
		button.type="shell";
		button.noOfPiece=12;
		button.size=8;
		button.color="red";
		
		Button button1 = new Button();
		button1.shape="round";
		button1.material="plastic";
		button1.type="shell";
		button1.noOfPiece=12;
		button1.size=8;
		button1.color="red";
		
		Button button3 = new Button();
		button3.shape="square";
		button3.material="wood";
		button3.type="shank";
		button3.noOfPiece=22;
		button3.size=12;
		button3.color="pink";
		
		boolean b =button.equals(button1);
		System.out.println(b);
		
		boolean b1 =button.equals(button3);
		System.out.println(b1);
		
		boolean b2 =button1.equals(button3);
		System.out.println(b2);
	}

}
