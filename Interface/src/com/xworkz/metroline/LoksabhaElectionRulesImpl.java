package com.xworkz.metroline;

public class LoksabhaElectionRulesImpl implements ElectionRules {

	@Override
	public String electionName() {
		System.out.println("election name");
		String name ="loksabha";
		return name ;
	}

	@Override
	public int candidateAge() {
		System.out.println("candidate age");
		int c_age = 25;
		return c_age;
	}

	@Override
	public int votersAge() {
		System.out.println("voters age");
		int v_age =21;
		return v_age;
	}

	@Override
	public boolean votingBooth() {
		System.out.println("voting booth is available");
		return true;
	}

	@Override
	public boolean voterId() {
		System.out.println("candidate having voterId");
		return true;
	}

}
