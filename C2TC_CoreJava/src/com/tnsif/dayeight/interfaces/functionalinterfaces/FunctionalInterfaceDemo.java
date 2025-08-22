//Program to demonstrate FunctionalInterface
package com.tnsif.dayeight.interfaces.functionalinterfaces;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		GreatClass g = new GreatClass();
		System.out.println(g.greet());

		//using Lambda Expression
		GreatInterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());

	}
}
