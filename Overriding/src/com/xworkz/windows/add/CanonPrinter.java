package com.xworkz.windows.add;

public class CanonPrinter extends Printer{
	@Override
	public void print() {
		System.out.println("printer is printing....");
	}
	@Override
	public void scan() {
		System.out.println("printer is scaning.....");
	}
	@Override
	public void copy() {
		System.out.println("printer is copying.....");// till here override is done
	}
	public void ConnectToWifi() {
		System.out.println("Printer is connected to wifi.....");
	}

}
