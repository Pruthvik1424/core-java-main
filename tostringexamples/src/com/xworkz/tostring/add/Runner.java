package com.xworkz.tostring.add;

import com.xworkz.tostring.Battery;
import com.xworkz.tostring.Colgate;
import com.xworkz.tostring.Paint;
import com.xworkz.tostring.Ring;
import com.xworkz.tostring.Switchboard;
import com.xworkz.tostring.Table;
import com.xworkz.tostring.Tie;

public class Runner {
   
	public static void main(String[] args) {
		Colgate colgate = new Colgate();
		System.out.println(colgate);
		System.out.println(colgate.hashCode());
		System.out.println("_______________________");
		
		Tie tie = new Tie();
		System.out.println(tie);
		System.out.println(tie.hashCode());
		System.out.println("____________________________");
		
		Battery battery = new Battery();
		System.out.println(battery);
		System.out.println(battery.hashCode());
		System.out.println("_______________________");
		
        Switchboard switchboard = new Switchboard();
        System.out.println(switchboard);
        System.out.println(switchboard.hashCode());
        System.out.println("_________________________");
        
        Table table = new Table();
        System.out.println(table);
        System.out.println(table.hashCode());
        System.out.println("_____________________________");
        
        Ring ring = new Ring();
        System.out.println(ring);
        System.out.println(ring.hashCode());
        System.out.println("_____________________________");
        
        Paint paint = new Paint();
        System.out.println(paint);
        System.out.println(paint.hashCode());
        System.out.println("________________________________");
	}
}
