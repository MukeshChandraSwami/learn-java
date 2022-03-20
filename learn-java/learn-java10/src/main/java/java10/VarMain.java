package java10;

import java.util.ArrayList;

public class VarMain {

    public static void main(String[] args) {
        var x = test();
        x = (int)13.14;

        var list = new ArrayList<String>();
        list.add("Mukesh");
        list.add("10");

        System.out.println("X :- " + x);

        list.forEach(d -> System.out.println("data :- " + d));

        String str = null;
        var s = str;
        System.out.println(s);

    }

    private static int test() {
        return 100;
    }
}
