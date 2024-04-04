package com.xworkz.metroline;

public interface MetroRules {
     
	String GREEN_LINE= "green";
	String PURPLE_LINE ="purple";
	String YELLOW_LINE="yellow";
	
	
	int buyTicket();
	boolean excessLuggage();
	boolean cleaniness();
	String getLine();
	
}
