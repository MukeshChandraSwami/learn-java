package java8.lambda;

import java8.interfae.Test;

/**
 * @author G522141
 *
 */
public class TestImpl{

	public static void main(String[] args) {
		final int i = 10;
		
		Test t = () -> System.out.println("Hello i :- " + i);
		t.print();
	}
}
