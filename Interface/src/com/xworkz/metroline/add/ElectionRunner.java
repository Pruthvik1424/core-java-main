package com.xworkz.metroline.add;

import com.xworkz.admin.ElectionAdmin;
import com.xworkz.metroline.ElectionRules;
import com.xworkz.metroline.LoksabhaElectionRulesImpl;

public class ElectionRunner {

	public static void main(String[] args) {
	ElectionRules election=	new LoksabhaElectionRulesImpl();
    
	ElectionAdmin ele = new ElectionAdmin(election);
	ele.c_age();
	ele.name();
	ele.v_age();
	ele.votingbooth();
	ele.voterId();
	}

}
