package com.xworkz.multiple.add;

import com.xworkz.multiple.Cricket;
import com.xworkz.multiple.Playgames;
import com.xworkz.multiple.Realcricket20;

public class Gamerunner {

	public static void main(String[] args) {
		
		Playgames playgames = new Playgames();
		
		Cricket cricket = new Cricket();
		playgames.runPlaygames(cricket);
		
		Realcricket20 realcricket20 = new Realcricket20();
		playgames.runPlaygames(realcricket20);

	}

}
