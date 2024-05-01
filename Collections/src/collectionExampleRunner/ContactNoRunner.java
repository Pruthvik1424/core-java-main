package collectionExampleRunner;

import java.util.Collection;

import collectionExample.ContactNo;

public class ContactNoRunner {

	public static void main(String[] args) {
		Collection<Long> collection = ContactNo.getContactNo();
		System.out.println("Total ContactNo:"+collection.size());
		
		for(Long no:collection)
		{
			System.out.println(no);
		}

	}

}
