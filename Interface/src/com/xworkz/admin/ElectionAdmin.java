package com.xworkz.admin;

import com.xworkz.metroline.ElectionRules;

public class ElectionAdmin {
  
	private ElectionRules electionrules;
	
	public ElectionAdmin(ElectionRules electionrules) {
		this.electionrules  = electionrules;
		
	}
	
	public void name() {
		if(electionrules!=null) {
			System.out.println(electionrules.electionName());
		}else {
			System.err.println("no election");
		}
	}
	public void c_age() {
		if(electionrules.candidateAge()==25) {
			System.out.println("elected candidate is eligible");
		}else {
			System.err.println("elected candidate is not eleigible");
		}
	}
	public void v_age() {
		if(electionrules.votersAge()==21) {
			System.out.println("candidate is eligible to vote");
		}
		else {
			System.err.println("candidate is not elegible for voting");
		}
	}
	public void votingbooth() {
		if(electionrules.votingBooth()==true) {
			System.out.println("voting booth is available ");
		}else {
			System.err.println("voting booth is not avilable");
		}
	}
	public void voterId() {
		if(electionrules.voterId()==true) {
			System.out.println("voterid is available");
		}else {
			System.out.println("voter id is not available");
		}
	}
}
