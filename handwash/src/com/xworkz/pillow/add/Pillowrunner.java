package com.xworkz.pillow.add;

import com.xworkz.pillow.Airpillow;
import com.xworkz.pillow.Microfiberpillow;
import com.xworkz.pillow.Pillow;
import com.xworkz.pillow.Pruthvi;

public class Pillowrunner {

	public static void main(String[] args) {
	    Pruthvi pruthvi = new Pruthvi();  
	    
	    Pillow pillow = new Pillow();
		pruthvi.runPillow(pillow);
		
		Airpillow airpillow = new Airpillow();
		pruthvi.runAirpillow(airpillow);
		
		Microfiberpillow microfiberpillow =new Microfiberpillow();
		pruthvi.runMicrofiberpillow(microfiberpillow);
	}

}
