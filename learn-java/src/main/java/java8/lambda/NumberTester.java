package java8.lambda;

import java8.interfae.CheckOddAndEven;
import java8.interfae.CheckPrime;

public class NumberTester {
	
	public static void main(String[] args) {
		
		CheckOddAndEven isOdd = num -> num %2 != 0;
		System.out.println("Num is odd :- " + isOdd.check(11));
		
		
		CheckPrime isPrime = num -> {
			int i = 2;
			num = Math.abs(num);
			while (i < num / 2) {
				if(num % 2 == 0) {
					return false;
				}
				++i;
			}
			return true;
		};
		
		System.out.println("Is Prime :- " + isPrime.check(1));
	}

}
