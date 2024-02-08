package com.xworkz.pillow;

public class Pruthvi {
	
	public void runPillow(Pillow pillow) {
		
		System.out.println(pillow.Material);
		pillow.soft();
		
		if(pillow instanceof Airpillow) {
			Airpillow airpillow = (Airpillow)pillow;
			System.out.println(airpillow.Purpose);
			airpillow.Store();
		}
		else if(pillow instanceof Microfiberpillow) {
			Microfiberpillow microfiberpillow = (Microfiberpillow)pillow;
			System.out.println(microfiberpillow.Price);
			microfiberpillow.Fillgaps();
		}
	}
	public void runAirpillow(Airpillow airpillow) {
		System.out.println(airpillow.Purpose);
		airpillow.Store();
		
		if(airpillow instanceof Pillow) {
			Pillow pillow =(Pillow)airpillow;
			System.out.println(pillow.Material);
			pillow.soft();
		}
	}
	public void runMicrofiberpillow(Microfiberpillow microfiberpillow) {
		System.out.println(microfiberpillow.Price);
		microfiberpillow.Fillgaps();
		
		if(microfiberpillow instanceof Pillow) {
			Pillow pillow1 =(Pillow)microfiberpillow;
			System.out.println(pillow1.Material);
			pillow1.soft();
		}
	}

}
