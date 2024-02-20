package com.xworkz.encapsulation;

public class Box {
      String shape;
      int price;
      String capacity;
      
      @Override
    public String toString() {
        System.out.println("running box param........");
    	return "Box : Shape :"+this.shape+", price:"+price +", capacity :"+capacity;
    }
      
      public String getShape() {
		return this.shape;
      }
      public int getPrice() {
		return this.price;
    	  
      }
      public String getCapacity() {
		return this.capacity;
      }
      
      public void setShape(String shape) {
    	  this.shape= shape;
      }
      public void setPrice(int price) {
    	  this.price = price;
      }
      public void setCapacity(String capacity) {
    	  this.capacity = capacity;
      }
      
      @Override
    public boolean equals(Object obj) {
    	  System.out.println(this);
    	  if(obj!= null && obj instanceof Box) {
    		  Box b = (Box)obj;
    		  Box b1 = (Box)obj;
    		  if(this.shape.equals(b.shape) || this.capacity.equals(b1.capacity)) {
    			  System.out.println("running box b.........");
    			  return true;
    		  }
    		  if(this.price==(b.price) || this.capacity.equals(b.capacity)) {
    			  System.out.println("running price......");
    			  return false;
    		  }
    	  }
    	return true;
    }
}
