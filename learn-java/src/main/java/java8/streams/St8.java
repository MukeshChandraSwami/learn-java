package java8.streams;

import java8.utils.ResourceLoader;

import java.util.stream.Stream;

public class St8 {

    public static void main(String[] args) {

        mergeCollectionsWithoutRepetation();
    }

    private static void mergeCollectionsWithoutRepetation() {

        Stream.concat(ResourceLoader.getInts().stream(),ResourceLoader.getInts2().stream())
        .distinct()
        .forEach(System.out::println);
    }


}
