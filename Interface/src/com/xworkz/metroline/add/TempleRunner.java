package com.xworkz.metroline.add;

import com.xworkz.admin.TempleAdmin;
import com.xworkz.metroline.ChamundeshwariTempleRulesImpl;
import com.xworkz.metroline.TempleRules;

public class TempleRunner {

	public static void main(String[] args) {

		TempleRules temple = new ChamundeshwariTempleRulesImpl();
//		temple.openTime();

//		ChamundeshwariTempleRulesImpl close = new ChamundeshwariTempleRulesImpl();
//		close.closedTime();
//		
//		Object obj = new ChamundeshwariTempleRulesImpl();
//		obj.hashCode();
		
		TempleAdmin temp = new TempleAdmin(temple);
		temp.closetime();
		temp.opentime();
		temp.specialentry();
		

	}

}
