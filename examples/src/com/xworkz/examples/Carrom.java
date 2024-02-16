package com.xworkz.examples;

public class Carrom {
	public Carrom() {
		System.out.println("no paramete constructor of Fan");
	}
	public String brand;
	public int price;
	public String color;
	public int noOfPlayers;
	public String shape;
	public String genre;
	
	@Override
	public String toString() {
		return "Carrom=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Color:"+color+"\t"+"noOfPlayers:"+noOfPlayers+"\t"+"Shape:"+shape+"\t"+"genre:"+genre;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method running in carrom class");
		System.out.println("Type:"+this);
		if(obj!=null && obj instanceof Carrom)
		{
			Carrom ref=(Carrom)obj;
			System.out.println("Object:"+ref);
			if(this.price==ref.price && this.brand.equals(ref.brand) && this.genre.equals(ref.genre))
			{
				
				return true;
			}
		}
		return false;
    }
}
