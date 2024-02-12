package com.xworkz.vegitables;

public class eatVegitables {
  
	public void runObject(Object object) {
		
		if (object instanceof Vegitables) {
		Vegitables vegitables = (Vegitables)object;
		System.out.println(vegitables.noOfSpecies);
		vegitables.containNutrients();
		}
		
		if (object instanceof Carrot ) {
			Carrot carrot = (Carrot)object;
			System.out.println(carrot.place);
			carrot.types();
		}
		if(object instanceof Beetroot) {
			Beetroot beetroot = (Beetroot)object;
			beetroot.types();
			System.out.println(beetroot.originPlace);
		}
		if(object instanceof Capsicum) {
			Capsicum capsicum = (Capsicum)object;
			capsicum.originPlace();
			System.out.println(capsicum.color);
		}
		if(object instanceof Raddish) {
			Raddish raddish =(Raddish)object;
			raddish.originPlace();
			System.out.println(raddish.color);
		}
		if(object instanceof Beans) {
			Beans beans = (Beans)object;
			beans.seeds();
			System.out.println(beans.family);
		}
		if (object instanceof Cauliflower) {
		   Cauliflower cauliflower = (Cauliflower)object;
		   cauliflower.minaralDisribution();
		   System.out.println(cauliflower.types);
		}
		if (object instanceof Chilli) {
			Chilli chilli = (Chilli)object;
			chilli.potentialUse();
			System.out.println(chilli.color);
		}
		if (object instanceof Cucumbar) {
			Cucumbar cucumbar = (Cucumbar)object;
			cucumbar.seeds();
			System.out.println(cucumbar.color);
		}
		if(object instanceof Onion) {
			Onion onion =(Onion)object;
			onion.Species();
			System.out.println(onion.type);
		}
		if(object instanceof Pumpkin) {
			Pumpkin pumpkin = (Pumpkin)object;
			pumpkin.types();
			System.out.println(pumpkin.Species);
		}
		if (object instanceof Tomato) {
			Tomato tomato =(Tomato) object;
			tomato.originPlace();
			System.out.println(tomato.color);
		}
		
	}
	
}
