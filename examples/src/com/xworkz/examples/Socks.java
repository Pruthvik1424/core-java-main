package com.xworkz.examples;

public class Socks {
	public Socks() {
		System.out.println("no paramete constructor of Fan");
	}
	public String brand;
	public int price;
	public String color;
	public String cloth;
	public String type;
	public String catagory;
	
	@Override
	public String toString() {
		return "Socks=Brand:"+brand+"\t"+"Price:"+price+"\t"+"Color:"+color+"\t"+"cloth:"+cloth+"\t"+"Material Type:"+type+"\t"+"catagory:"+catagory;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method running in socks class");
		System.out.println("Type:"+this);
		if(obj!=null && obj instanceof Socks)
		{
			Socks ref=(Socks)obj;
			System.out.println("Object:"+ref);
			if(this.price==ref.price && this.brand.equals(ref.brand) && this.catagory.equals(ref.catagory))
			{
				
				return true;
			}
		}
		return false;
    }
}
