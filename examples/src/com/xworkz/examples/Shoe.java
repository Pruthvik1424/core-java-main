package com.xworkz.examples;

public class Shoe {
	public Shoe() {
		System.out.println("no paramete constructor of shoe");
	}
	public String brand;
	public int price;
	public String material;
	public String type;
	public char size;
	public String catagory;
	
	@Override
	public String toString() {
		return "Plate=Brand:"+brand+"\t"+"Price:"+price+"\t"+"material:"+material+"\t"+"type:"+type+"\t"+"size:"+size+"\t"+"catagory:"+catagory;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method running in Shoe class");
		System.out.println("Type:"+this);
		if(obj!=null && obj instanceof Shoe)
		{
			Shoe ref=(Shoe)obj;
			System.out.println("Object:"+ref);
			if(this.price==ref.price && this.brand.equals(ref.brand) && this.catagory.equals(ref.catagory))
			{
				
				return true;
			}
		}
		return false;
    }
}
