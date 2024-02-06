package com.xworkz.windows.add;

public class SmartCanonPrinter extends CanonPrinter{
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
		System.out.println("printer is copying.....");
	}
	@Override
	public void ConnectToWifi() {
		System.out.println("Printer is connected to wifi....."); // till here overriding is done
	}
	public void connectToMobile() {
		System.out.println("printer is connected to printer....");
		
	}

}
