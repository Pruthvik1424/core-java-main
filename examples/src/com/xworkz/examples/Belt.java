package com.xworkz.examples;

public class Belt {
	 public int length;
	    public String type;
	    public int price;
	    public String material;
	    
	    
	    public Belt()
	    {
	    	System.out.println("no param for belt");
	    }
	    
	    @Override
	    public String toString() {
	    	
	    	return "Belt:length:"+this.length+"\t"+"type:"+this.type+"\t"+"price:"+this.price+"\t"+"material:"+this.material;
	        
	        
	    }
	    @Override
	    public boolean equals(Object obj)
	    {
	    	System.out.println("running in belt class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof Belt)
	    	{
	    		Belt ref=(Belt)obj;
	    		
	    		if(this.length == ref.length && this.material.equals(material) && this.type.equals(type) )
	    		{
	    			System.out.println("Comparing:"+ref);
	    			return true;
	    		}
	    		
	    	}
	    	return false;
	    }
}
