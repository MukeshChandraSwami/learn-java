package java8.streams;

import java8.utils.ResourceLoader;

import java.util.stream.Collectors;

public class St9 {

    public static void main(String[] args) {

        joinStringsOfList();
    }

    private static void joinStringsOfList() {

        String str = ResourceLoader.getStrings()
                .stream()
                .collect(Collectors.joining(","))
                ;

        System.out.println(str);
    }
}
