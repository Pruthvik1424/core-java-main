package collectionExample;

import java.util.ArrayList;
import java.util.Collection;

public class Address {

	public static void main(String[] args) {
	
		Collection<String> collection = new ArrayList<String>();
		
		collection.add("Chamarajanagar");
		collection.add("Mysore");
		collection.add("Banglore");
		collection.add("Mandya");
		collection.add("Hubli");
		collection.add("Gadag");
		collection.add("Bagalkot");
		collection.add("Davangere");
		collection.add("Shivmoga");
		collection.add("Hoskote");
		
		System.out.println("Address :"+ collection.size());
		
		for(String address : collection) {
			System.out.println(address);
		}
	}

}
