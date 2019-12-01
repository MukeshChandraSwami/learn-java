package java8.streams;

import java8.utils.ResourceLoader;

public class St6 {

    public static void main(String[] args) {

        findAny();

        findFirst();
    }

    private static void findAny() {

       int i = ResourceLoader.getInts()
                .stream()
               .filter(num -> num < -5)
                .findAny()
                .get();

       System.out.println(i);
    }

    private static void findFirst(){

        int i = ResourceLoader.getInts()
                .stream()
                .filter(num -> num < -5)
                .findFirst()
                .get();

        System.out.println(i);

    }
}
