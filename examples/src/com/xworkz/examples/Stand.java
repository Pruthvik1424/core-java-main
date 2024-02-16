package com.xworkz.examples;

public class Stand {
	public Stand() {
		System.out.println("no paramete constructor of Stand");
	}
	public String brand;
	public int price;
	public String color;
	public String shape;
	public String materialType;
	public String catagory;
	
	@Override
	public String toString() {
		return "Stand=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Color:"+color+"\t"+"Shape:"+shape+"\t"+"Material Type:"+materialType+"\t"+"type:"+catagory;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method running in Stand class");
		System.out.println("Type:"+this);
		if(obj!=null && obj instanceof Stand)
		{
			Stand ref=(Stand)obj;
			System.out.println("Object:"+ref);
			if(this.price==ref.price && this.brand.equals(ref.brand) && this.materialType.equals(ref.materialType))
			{
				
				return true;
			}
		}
		return false;
    }
}
