package com.xworkz.metroline;

public class ChamundeshwariTempleRulesImpl implements TempleRules{

	@Override
	public double openTime() {
		System.out.println("Temple open");
		double time = 8.00d;
		return time;
	}

	@Override
	public double closedTime() {
        System.out.println("Temple Closes");
        double time=10.00;
		return time;
	}

	@Override
	public double specialEntry() {
		System.out.println("Special Entry");
		return 500.00;
		// here if we give less or more than 500 then it will return not available
	}

}
