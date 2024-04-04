package com.xworkz.metroline.add;

import com.xworkz.admin.MetroAdmin;
import com.xworkz.metroline.BanashankariMetroRulesimpl;
import com.xworkz.metroline.MetroRules;

public class MetroRunner {

	public static void main(String[] args) {

		MetroRules metro = new BanashankariMetroRulesimpl();

		metro.buyTicket();
		
		BanashankariMetroRulesimpl banMetro = new BanashankariMetroRulesimpl();
		banMetro.cleaniness();
		
		Object obj = new BanashankariMetroRulesimpl();
		obj.getClass();
		
		MetroAdmin rules = new MetroAdmin(metro);
		rules.metroAdmin();
	}

}
