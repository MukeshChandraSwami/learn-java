package java8.v2.lambda;

import java.util.Comparator;

public class RunnableUsingLambda {

    public static void main(String[] args) {

        Comparator<Integer> reversed = (Comparator<Integer>) Comparator.naturalOrder().reversed();

        int compare = reversed.compare(1, 2);
        System.out.println(compare);
    }
}
