package com.xworkz.window;

import com.xworkz.windows.add.CanonPrinter;
import com.xworkz.windows.add.Printer;
import com.xworkz.windows.add.SmartCanonPrinter;

public class PrinterRunner {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		printer.print();
		printer.scan();
		printer.copy();
		System.out.println("!!!!!!!!!!!!!!!!!!");
		
		CanonPrinter canonprinter = new CanonPrinter();
		canonprinter.print();
		canonprinter.scan();
		canonprinter.copy();
		canonprinter.ConnectToWifi();
		System.out.println("!!!!!!!!!!!!!!!!!!");
		//or
		Printer canonprinter1 =new CanonPrinter();
		canonprinter1.print();
		canonprinter1.scan();
		canonprinter1.copy();
		
		Printer Canon1 =(Printer)canonprinter1;
		((CanonPrinter) Canon1).ConnectToWifi();
		System.out.println("#####################");
		
		SmartCanonPrinter smartcanonprinter = new SmartCanonPrinter();
		smartcanonprinter.print();
		smartcanonprinter.scan();
		smartcanonprinter.copy();
		smartcanonprinter.ConnectToWifi();
		smartcanonprinter.connectToMobile();
		System.out.println("!!!!!!!!!!!!!!!!!!");
//		or
		CanonPrinter Smart1 = new SmartCanonPrinter();
		Smart1.print();
		Smart1.scan();
		Smart1.copy();
		Smart1.ConnectToWifi();
		((SmartCanonPrinter) Smart1).connectToMobile();
		System.out.println("!!!!!!!!!!!!!!!!!!");
//		or
		Printer Smart2 =new SmartCanonPrinter();
		Smart2.print();
		Smart2.scan();
		Smart2.copy();
		((CanonPrinter) Smart2).ConnectToWifi();
		((SmartCanonPrinter) Smart2).connectToMobile();
		

	}

}
