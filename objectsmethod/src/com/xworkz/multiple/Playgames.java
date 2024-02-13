package com.xworkz.multiple;

public class Playgames {
    
	public void runPlaygames(Games games) {
		
		System.out.println(games.name);
		games.outdoor();
		
		if(games instanceof Cricket) {
			Cricket cricket = (Cricket)games;
			cricket.type();
			System.out.println(cricket.noOfPlayers);
		}
		if(games instanceof Realcricket20) {
			Realcricket20 ralcricket20 = (Realcricket20)games;
			ralcricket20.downloading();
			System.out.println(ralcricket20.type);
		}
	}
}
