package com.xworkz.funcInterfaceRunner;

import com.xworkz.funcInterface.Book;

public class BookRunner {
	 public static void main(String[] args) 
	    {
	        Book book =(noOfPages)-> System.out.println("Number of pages in the book is: " + noOfPages);
	        book.displayPages(200); 
	    }
}
