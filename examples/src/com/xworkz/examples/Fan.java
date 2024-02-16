package com.xworkz.examples;

public class Fan {
	public Fan() {
		System.out.println("no paramete constructor of Fan");
	}
	public String brand;
	public int price;
	public String color;
	public String type;
	public int noOfWings;
	public String catagory;
	
	@Override
	public String toString() {
		return "Stand=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Color:"+color+"\t"+"type:"+type+"\t"+"Material Type:"+noOfWings+"\t"+"type:"+catagory;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method running in Fan class");
		System.out.println("Type:"+this);
		if(obj!=null && obj instanceof Fan)
		{
			Fan ref=(Fan)obj;
			System.out.println("Object:"+ref);
			if(this.price==ref.price && this.brand.equals(ref.brand) && this.catagory.equals(ref.catagory))
			{
				
				return true;
			}
		}
		return false;
    }
}
