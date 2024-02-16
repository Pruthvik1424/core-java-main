package com.xworkz.examples;

public class Plate {
	public Plate() {
		System.out.println("no paramete constructor of plate");
	}
	public String brand;
	public int price;
	public String material;
	public String type;
	public String shape;
	public String ocasion;
	
	@Override
	public String toString() {
		return "Plate=Brand:"+brand+"\t"+"Price:"+price+"\t"+"material:"+material+"\t"+"type:"+type+"\t"+"Shape:"+shape+"\t"+"ocasion:"+ocasion;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method running in Plate class");
		System.out.println("Type:"+this);
		if(obj!=null && obj instanceof Plate)
		{
			Plate ref=(Plate)obj;
			System.out.println("Object:"+ref);
			if(this.price==ref.price && this.brand.equals(ref.brand) && this.ocasion.equals(ref.ocasion))
			{
				
				return true;
			}
		}
		return false;
    }
}
