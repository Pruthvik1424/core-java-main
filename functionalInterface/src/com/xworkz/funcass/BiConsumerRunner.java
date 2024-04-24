package com.xworkz.funcass;

import java.util.function.BiConsumer;

import com.xworkz.func.BiconsumerAssociation;

public class BiConsumerRunner {

	public static void main(String[] args) {
		BiConsumer<String, Integer> BiConsumer= (s,i)-> System.out.println("String: "+s+", Integer: "+i);
		BiconsumerAssociation.processBiConsumer(BiConsumer, "welcome", 15);

	}

}
