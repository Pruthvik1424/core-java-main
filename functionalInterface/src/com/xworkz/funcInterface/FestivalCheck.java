package com.xworkz.funcInterface;

public class FestivalCheck {
	
	private Festival festival;
	
	public FestivalCheck(Festival festival) {
		this.festival = festival;
		
	}
	
	public void check() {
		System.out.println("running check in festivalCheck");
		boolean value = this.festival.prepare("sweet", "flower");
		if(value) {
			System.out.println("prepared");
		}else {
			System.out.println("not prepared");
		}
	}

}
