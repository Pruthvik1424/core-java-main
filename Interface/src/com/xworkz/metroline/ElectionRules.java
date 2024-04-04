package com.xworkz.metroline;

public interface ElectionRules {

//	here declaring public or package default is not mandatory
	String ELECTION_NAME = "name";
	
	String electionName();
	int candidateAge();
	int votersAge();
	boolean votingBooth();
	boolean voterId();
	 

}
