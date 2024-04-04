package com.xworkz.admin;

import com.xworkz.metroline.MetroRules;

public class MetroAdmin {
    
	private MetroRules metrorules;
	
	public MetroAdmin(MetroRules metrorules) {
		this.metrorules=metrorules;
	}
	
	public void  metroAdmin() {
		
		if(metrorules!=null) {
			
			
			if(metrorules.cleaniness() && metrorules.excessLuggage()) {
				System.out.println("metro rules is good");
			}
			else {
				System.err.println("metro rules is not good");
			}
		}
	}
	
}
