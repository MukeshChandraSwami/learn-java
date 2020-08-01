package java8.v1.streams;

import java8.utils.ResourceLoader;

import java.util.stream.Collectors;

public class St4 {

    public static void main(String[] args) {

        // Remove Duplicates Using Distinct method of stream
        removeDuplicatesUsingDistinct();

        // Remove duplicates using collectors
        removeDuplicatesUsingCollectors();

    }

    private static void removeDuplicatesUsingDistinct(){

        System.out.println("Original List :- " + ResourceLoader.getInts());

        System.out.println("After removing duplicates :- ");
        ResourceLoader.getInts()
                .stream().distinct().forEach(System.out::println);
    }


    private static void removeDuplicatesUsingCollectors(){
        System.out.println("Original List :- " + ResourceLoader.getInts());

        System.out.println("After removing duplicates :- ");
        ResourceLoader.getInts().stream().collect(Collectors.toSet()).forEach(System.out::println);
    }
}
