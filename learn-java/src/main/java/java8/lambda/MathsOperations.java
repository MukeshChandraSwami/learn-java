package java8.lambda;

import java8.interfae.AirthmeticOperation;

public class MathsOperations {
	
	public static void main(String[] args) {
	
		AirthmeticOperation add = (a,b) -> a + b;
		AirthmeticOperation sub = (int a, int b) -> {return a - b;};
		AirthmeticOperation mul = (a,b) -> {return a * b;};
		AirthmeticOperation div = (int a, int b) -> a / b;
		
		System.out.println("Addition :- " + add.operation(20, 10));
		System.out.println("Subtraction :- " + sub.operation(20, 10));
		System.out.println("Multiplication :- " + mul.operation(20, 10));
		System.out.println("Dividation :- " + div.operation(20, 10));
	}
}
