package com.xworkz.tostring;

public class Table {
    public String madeby = "wood";
    public String wood ="thega";
    public String length = "5inches";
    
    @Override
    public String toString() {
    	System.out.println("madeby :"+ madeby + "wood :"+wood +"lenth :"+length);
    	return super.toString();
    }
    		
}
