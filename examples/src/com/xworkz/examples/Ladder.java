package com.xworkz.examples;

public class Ladder {
	public Ladder() {
		System.out.println("no paramete constructor of shoe");
	}
	public String brand;
	public int price;
	public String material;
	public String loadCapacity;
	public String specialFeature;
	public String weight;
	
	@Override
	public String toString() {
		return "Ladder=Brand:"+brand+"\t"+"Price:"+price+"\t"+"material:"+material+"\t"+" loadCapacity:"+ loadCapacity+"\t"+"specialFeature:"+specialFeature+"\t"+"weight:"+weight;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method running in ladder class");
		System.out.println("Type:"+this);
		if(obj!=null && obj instanceof Ladder)
		{
			Ladder ref=(Ladder)obj;
			System.out.println("Object:"+ref);
			if(this.price==ref.price && this.brand.equals(ref.brand) && this.specialFeature.equals(ref.specialFeature))
			{
				
				return true;
			}
		}
		return false;
    }
}
