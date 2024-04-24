package collectionExample;

import java.util.ArrayList;
import java.util.Collection;

public class Colors {

	public static void main(String[] args) {
	Collection<String> collection = new ArrayList<String>();
	collection.add("Red");
	collection.add("Blue");
	collection.add("Green");
	collection.add("Yellow");
	collection.add("Brown");
	collection.add("Black");
	collection.add("Pink");
	collection.add("Orange");
	collection.add("Voilet");
	collection.add("LightBlue");
	
	System.out.println("Colors :"+collection.size());
	System.out.println("Colors :"+ collection.hashCode());
	
	// for each method 
	
	for(String color : collection) {
		System.out.println(color);
	}
	}

}
