package com.xworkz.examples;

public class Mug {
	public Mug() {
		System.out.println("no paramete constructor of Mug");
	}
	public String brand;
	public int price;
	public String color;
	public String shape;
	public String materialType;
	public String type;
	
	@Override
	public String toString() {
		return "Mug=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Color:"+color+"\t"+"Shape:"+shape+"\t"+"Material Type:"+materialType+"\t"+"type:"+type;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method running in Mug class");
		System.out.println("Type:"+this);
		if(obj!=null && obj instanceof Mug)
		{
			Mug ref=(Mug)obj;
			System.out.println("Object:"+ref);
			if(this.price==ref.price && this.brand.equals(ref.brand) && this.materialType.equals(ref.materialType))
			{
				
				return true;
			}
		}
		return false;
    }
}
