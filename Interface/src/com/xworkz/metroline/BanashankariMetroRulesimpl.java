package com.xworkz.metroline;

public class BanashankariMetroRulesimpl implements MetroRules {

	@Override
	public int buyTicket() {
		System.out.println("ticket price");
		return 55;
	}

	@Override
	public boolean excessLuggage() {
		System.out.println("is luggage is excess");
		return false;
	}

	@Override
	public boolean cleaniness() {
		System.out.println("cleaniness");
		return true;
	}

	@Override
	public String getLine() {
		System.out.println("purple line");
		return MetroRules.PURPLE_LINE;
	}

}
