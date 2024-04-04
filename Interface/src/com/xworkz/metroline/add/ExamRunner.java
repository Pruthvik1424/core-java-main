package com.xworkz.metroline.add;

import com.xworkz.admin.ExamAdmin;
import com.xworkz.metroline.ExamRules;
import com.xworkz.metroline.PsiExamRulesImpl;

public class ExamRunner {

	public static void main(String[] args) {
	ExamRules exam =	new PsiExamRulesImpl();
	
	
	ExamAdmin exam1 = new ExamAdmin(exam);
	exam1.hallTicket();
	exam1.investigator();
	exam1.duration();
	
	
	}

}
