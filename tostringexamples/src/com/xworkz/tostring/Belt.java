package com.xworkz.tostring;

public class Belt {
	public int length=100;
	public String type="weist";
	public double price=150;
	public String material="lether";
	
	
	public Belt() {
		System.out.println("no param const.....");
	}
	
	@Override
	public String toString() {
		return "Belt : length"+ this.length+ ", type :"+this.type + ", price :" +this.price +", material :"+this.material;
	}
	
	@Override
	public boolean equals(Object obj) {
	   System.out.println("equals int :" +this);
	   System.out.println("equals int :"+obj);
	   if(obj!=null && obj instanceof Belt) {
		   Belt belt1 = (Belt)obj;
		   if(this.type.equals(belt1.type) && this.material== belt1.material) {
			   return true;
			   
		   }
		   
	   }
		return false;
	}

	
	

}
