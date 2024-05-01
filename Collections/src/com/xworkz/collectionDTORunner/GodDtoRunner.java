package com.xworkz.collectionDTORunner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.GodDTO;

public class GodDtoRunner {

	public static void main(String[] args) {
		GodDTO g1 = new GodDTO("Mahadeshwara","MM Hills","Shiva","Male","DestroyEverything");
		GodDTO g2 = new GodDTO("Parvati","kailasa","kempamma","Female","Nature");
		GodDTO g3 = new GodDTO("Lakshmi","Vaikunta","AdrushtaLakshmi","Female","Rich");
		GodDTO g4 = new GodDTO("Saraswati","Kailasa","Vidyasaraswati","Female","Education");
		GodDTO g5 = new GodDTO("Indra","Air","Indra","Male","Protect");
		GodDTO g6 = new GodDTO("Surya","Suryaloka","Suryadeva","Male","Belaku");
		GodDTO g7 = new GodDTO("ThirupatiTimmappa","Tirupati","Venkateshwara","Male","Vara");
		GodDTO g8 = new GodDTO("Bramha","Air","Bramha","male","Creator");
		GodDTO g9 = new GodDTO("Ganga","River","Water","Female ","Giving Water");
		GodDTO g10 = new GodDTO("Rama","Ayodya","Krishna","Male","Mahima");
		
		Collection<GodDTO> godCollection = new ArrayList<GodDTO>();
		godCollection.add(g1);	
		godCollection.add(g2);
		godCollection.add(g3);
		godCollection.add(g4);
		godCollection.add(g5);
		godCollection.add(g6);
		godCollection.add(g7);
		godCollection.add(g8);
		godCollection.add(g9);
		godCollection.add(g10);
		
		System.out.println("sorting by name in asec....");
		godCollection.stream().sorted().forEach(god-> System.out.println(god));
		
		
		System.out.println("---------------------------");
		System.out.println("sort by place in dec....");
		godCollection
		.stream()
		.sorted((p1,p2)->p2.getPlace().compareTo(p1.getPlace()))
		.map(place-> place.getPlace())
		.forEach(god-> System.out.println(god));
		
		System.out.println("---------------------------");
		System.out.println("sort by place in asec....");
		godCollection
		.stream()
		.sorted()
		.forEach(god->System.out.println(god.getPlace()));
		
		System.out.println("---------------------------");
		System.out.println("get all gods by gender male, sort by avatar in dec");
		godCollection
		.stream()
		.filter(gender-> gender.getGender().equals("Male"))
		.sorted((a1,a2)-> a2.getAvatar().compareTo(a1.getAvatar()))
		.forEach(null);
		

	      System.out.println("_________________");
	      System.out.println("get gender by male sort by avatar in descending:");
	      godCollection
	      .stream()
	      .filter(gender->gender.getGender().equals("Male"))
	      .sorted((a1,a2)->a2.getAvatar().compareTo(a1.getAvatar()))
	      .forEach(avatar->System.out.println(avatar));
	      
	      System.out.println("_________________");
	      System.out.println("get all gods by gender female sort by place in descening");
	      godCollection
	      .stream()
	      .filter(gender->gender.getGender().equals("Female"))
	      .sorted((gf1,gf2)->gf2.getAvatar().compareTo(gf1.getAvatar()))
	      .forEach(av->System.out.println(av));
	      
	      
	      System.out.println("_________________");
	      System.out.println("get only places sort by descending order:");
	      godCollection
	      .stream()
	      .sorted((p1,p2)->p2.getPlace().compareTo(p1.getPlace()))
	      .map(place->place.getPlace())
	      .forEach(place->System.out.println(place));
	      
	      System.out.println("_________________");
	      System.out.println("get only special power and sort by descending order:");
	      godCollection
	      .stream()
	      .sorted((sp1,sp2)->sp2.getSpecialPower().compareTo(sp1.getSpecialPower()))
	      .map(sp->sp.getSpecialPower())
	      .forEach(s->System.out.println(s));
	      
	      System.out.println("_________________");
	      System.out.println("get all by name and place and get only name sorted in descending:");
	      godCollection
	      .stream()
	      .filter(ref -> ref.getName().equals("Shiva") && ref.getPlace().equals("Mount Kailash"))
	      .sorted((n1,n2)->n2.getName().compareTo(n1.getName()))
	      .map(n->n.getName())
	      .forEach(n->System.out.println(n));

		
	}

}
