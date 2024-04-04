package com.xworkz.admin;

import com.xworkz.metroline.ExamRules;

public class ExamAdmin {

	private ExamRules examRules;
	
	public ExamAdmin(ExamRules examRules) {
		this.examRules = examRules;
	}
	
	
	public void hallTicket() {
		if(examRules!=null) {
			boolean hal = examRules.hallTicket();
			System.out.println("hallTicket is available" + hal);
			
		}else
		{
			System.err.println("hall ticket is not available");
		}
	}
	
	public void investigator() {
		if(examRules!=null) {
			String invest = examRules.investigator();
			System.out.println("investigatior name is :"+invest);
		}else {
			System.err.println("investigator is not avilable");
		}
	}
	
	public void duration() {
		if(examRules.duration() == 3.00) {
			System.out.println("Students can write exam within 3.00hrs");
		}else {
			System.err.println("not elegible for write exam");
		}
	}
	
}
