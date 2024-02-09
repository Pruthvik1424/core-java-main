package com.xworkz.animals;

public class Wildanimals {
      

		public void runTiger(Tiger tiger)
		  {
			tiger.Bite();
			System.out.println(tiger.type);
			
			if(tiger instanceof Lion)
			{
				Lion lion1 = (Lion )tiger;
				System.out.println(lion1.type1);
				lion1.fight();
			}
			
		  }	
			
			public void runLion(Lion lion) {
				
				 if(lion instanceof Cheeta)
			
				{
					Cheeta  cheeta = (Cheeta)lion;
					System.out.println(cheeta.color);
					cheeta.run();
				}
			}
			
}

