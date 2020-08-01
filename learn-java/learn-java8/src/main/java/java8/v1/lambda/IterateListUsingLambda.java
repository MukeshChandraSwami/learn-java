package java8.v1.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterateListUsingLambda {
	
	public IterateListUsingLambda() {}
	
	public IterateListUsingLambda(int a) {
		System.out.println(a);
	}
	
	public void print(int a) {
		System.out.print(a);
	}
	
	public static void println(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,13,233,4345,3456,456,2);
		
		// There are multiple ways to use forEach
		// 1. Simply printing using lambda expression by using Consumer interface.
		System.out.println("1. Simply printing using lambda expression by using Consumer interface.");
		list.forEach(n -> System.out.println(n));
		
		// 2. Iterate using consumer object.
		System.out.println("2. Iterate using consumer object.");
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		// 3. Iterate using :: operator with Method reference
		System.out.println("3. Iterate using :: operator with Method reference");
		list.forEach(System.out::println);
		
		// 4. Iterate using :: operator with custom Method reference
		System.out.println("4. Iterate using :: operator with custom Method reference");
		list.forEach(IterateListUsingLambda::println);
		
		// 5. Iterate using :: operator with Constructor reference
		System.out.println("5. Iterate using :: operator with Constructor reference");
		list.forEach(IterateListUsingLambda::new);
		
		// 6. Iterate using :: oeprator by using object
		System.out.println("6. Iterate using :: oeprator by using object");
		IterateListUsingLambda ob = new IterateListUsingLambda();
		list.forEach(ob :: print);
	}
}
