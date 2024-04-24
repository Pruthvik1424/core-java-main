package com.xworkz.funcInterfaceRunner;

import com.xworkz.funcInterface.Vegitables;

public class VegitableRunner {
	  public static void main(String[] args) 
	    {
	        Vegitables vegi = () -> {
	            String vegitableName = "Apple";
	            System.out.println("Selected Vegitable: " + vegitableName);
	            return vegitableName;
	        };

	        String selectVegi = vegi.getVegitableName();
	        System.out.println("Selected Vegitable name: " + selectVegi);
	    }
}
