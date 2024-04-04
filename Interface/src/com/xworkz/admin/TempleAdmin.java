package com.xworkz.admin;

import com.xworkz.metroline.TempleRules;

public class TempleAdmin {
	
	private TempleRules templeRules;
	
	public TempleAdmin(TempleRules templeRules)
	{
		this.templeRules = templeRules;
	}
	
	public void opentime() {
		if(templeRules!= null) {
			double time = templeRules.openTime();
			System.out.println("Temple opens at :"+time);
		}
		else {
			System.err.println("Temple is not opened");
		}
	}
	
	public void closetime() {
		if(templeRules!=null) {
			double time1 = templeRules.closedTime();
			System.out.println("Temple is closed at :"+time1);
		}
		else
		{
			System.out.println("temple is not closed");
		}
	}
	
	public void specialentry() {
		if(templeRules.specialEntry() == 500.00) {
			double fee = templeRules.specialEntry();
			System.out.println("Special entry is available for :"+fee);
		}
		else
		{
			System.err.println("Special entry is not aivailable");
		}
	}

}
