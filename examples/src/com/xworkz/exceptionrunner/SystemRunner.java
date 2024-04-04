package com.xworkz.exceptionrunner;

import com.xworkz.exception.SystemException;

public class SystemRunner {

	public static void main(String[] args) {
				SystemException systemException=new SystemException();
				try {
					
					systemException.display();
					systemException.run();
					systemException.write();
				} 
				catch (SystemException t) {
					
					//t.printStackTrace();
					System.err.println(t);
					System.err.println(t.getStackTrace());
				}

			

	}

}
