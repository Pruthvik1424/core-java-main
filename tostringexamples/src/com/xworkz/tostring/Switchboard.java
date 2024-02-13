package com.xworkz.tostring;

public class Switchboard {
    public int noOfSwitches = 5;
    public String price ="300rs";
    public int noOfSocates = 5;
    
    @Override
    public String toString() {
    	System.out.println("noOfSwitches :"+noOfSwitches + "price :"+price + " noOfSocates :"+ noOfSocates );
    	return super.toString();
    }
}
