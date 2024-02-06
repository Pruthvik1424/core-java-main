package com.xworkz.windows.add;

public class WoodWindow extends Window {
    
	@Override
	public void open() {
		System.out.println("running open in woodwindow");
	}
	@Override
	public void close() {
		System.out.println(" running close in woodwindow ");
	}
	public void autoclose() {
			System.out.println("running autoclose in woodwindow");
	}
}
