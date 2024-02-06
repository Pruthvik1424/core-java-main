package com.xworkz.window;

import com.xworkz.windows.add.Window;
import com.xworkz.windows.add.WoodWindow;

public class WindowRunner {
      
	public static void main(String[] args) {
		
		Window window = new Window();
		window.open();
		window.close();
		window.semiclose();
		System.out.println("-----------------");
		
		WoodWindow woodwindow = new WoodWindow();
		woodwindow.open();
		woodwindow.close();
		woodwindow.autoclose();
		System.out.println("...................");
		
		Window win1 = new WoodWindow();
		win1.close();
		win1.open();
		win1.semiclose();
		
		//typecasting 
		
		WoodWindow win2 =(WoodWindow)win1;
		win2.autoclose();
		
		
	}

	
}
