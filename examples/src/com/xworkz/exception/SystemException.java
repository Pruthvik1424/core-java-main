package com.xworkz.exception;

      
	public class SystemException extends Exception {
		
	
		private static final long serialVersionUID = 1L;


		public SystemException() {
			
		}
		public SystemException(String msg)
		{
			super(msg);
		}
		
		public void display() throws SystemException
		{
			throw new SystemException("Displaying system error....");
			
		}
		
		public void run() throws SystemException
		{
			throw new SystemException("system running problem...");
		}
		
		
		public void write() throws SystemException
		{
			throw new SystemException("writing ....");
		}

	}
