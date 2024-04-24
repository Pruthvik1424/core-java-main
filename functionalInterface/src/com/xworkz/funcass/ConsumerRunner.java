package com.xworkz.funcass;

import java.util.function.Consumer;

import com.xworkz.func.ConsumerCheck;
import com.xworkz.func.FunctionCheck;

public class ConsumerRunner {

	public static void main(String[] args) {
		Consumer<String> print = x -> System.out.println(x);
        print.accept("java");   // java
	}


}
