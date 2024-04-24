package collectionExample;

import java.util.ArrayList;
import java.util.Collection;

public class President {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();
			collection.add("Dr.A.P.J Abdulkalam");
			collection.add("Prathiba patil");
			collection.add("Pranab Mukarji");
			collection.add("Shri Ram Kovind");
			collection.add("Dr.Rajendra Prasad");
			
			System.out.println("no of presidents :"+collection.size());
			
			for(String president : collection) {
				System.out.println(president);
			}
		

	}

}
