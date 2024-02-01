package com.xworkz.examples.add;

import com.xworkz.examples.Buiscuit;
import com.xworkz.examples.Location;
import com.xworkz.examples.Monkey;
import com.xworkz.examples.Tree;

public class ExamplesRunner {

	public static void main(String[] args) {
		
		Tree tree =new Tree();
		tree.Name="mango";
        System.out.println(tree.Name);
        System.out.println("****************");
        
        tree.monkey=new Monkey();
        tree.monkey.Age=30;
        tree.monkey.Type="gorilla";
        System.out.println(tree.monkey.Age);
        System.out.println(tree.monkey.Type);
        System.out.println("*****************");
        
        tree.location =new Location();
        tree.location.Area="BTM";
        tree.location.city="Banglore";
        System.out.println(tree.location.Area);
        System.out.println(tree.location.city);
        System.out.println("********************");
        
        tree.monkey.buiscuit =new Buiscuit();
        tree.monkey.buiscuit.Brand="Good Day";
        tree.monkey.buiscuit.Cost=25.5d;
        System.out.println(tree.monkey.buiscuit.Brand);
        System.out.println(tree.monkey.buiscuit.Cost);
        
        
	}

}
