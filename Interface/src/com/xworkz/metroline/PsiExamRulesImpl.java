package com.xworkz.metroline;

public class PsiExamRulesImpl implements ExamRules {

	@Override
	public boolean hallTicket() {
		System.out.println("having hall ticket");
		return true;
	}

	@Override
	public String investigator() {
		System.out.println("investigator is");
		return "Pruthvi";
	}

	@Override
	public double duration() {
		System.out.println("exam duration");
		return 3.00;
	}
      
	
}
