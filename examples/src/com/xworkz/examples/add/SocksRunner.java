package com.xworkz.examples.add;

import com.xworkz.examples.Socks;

public class SocksRunner {

	public static void main(String[] args) {
		Socks socks1=new Socks();
		socks1.brand="jocky";
		socks1.type="Ancle";
		socks1.color="green";
		socks1.price=150;
		socks1.cloth="cotton";
		socks1.catagory="men's socks";
		
		Socks socks2=new Socks();
		socks2.brand="jocky";
		socks2.type="Ancle";
		socks2.color="green";
		socks2.price=150;
		socks2.cloth="cotton";
		socks2.catagory="men's socks";
		
		Socks socks3=new Socks();
		socks3.brand="jocky";
		socks3.type="Ancle";
		socks3.color="green";
		socks3.price=150;
		socks3.cloth="cotton";
		socks3.catagory="men's socks";
		
		boolean result1=socks1.equals(socks2);
		System.out.println(result1);
		System.out.println("----------------------------");
		
		boolean result2=socks1.equals(socks3);
		System.out.println(result2);
		System.out.println("----------------------------");
		
		boolean result3=socks2.equals(socks3);
		System.out.println(result3);

	}

}
