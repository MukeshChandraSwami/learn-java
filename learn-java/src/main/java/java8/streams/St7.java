package java8.streams;

import java8.utils.ResourceLoader;

import java.util.DoubleSummaryStatistics;

public class St7 {

    public static void main(String[] args) {

        count();

        sum();

        min();

        max();

        avg();

        stats();

    }

    private static void count() {

        long counter = ResourceLoader.getInts()
                .stream()
                .count();

        System.out.println("Total numbers  :- " + counter);
    }

    private static void sum() {

        long sum = ResourceLoader.getInts()
                .stream()
                .mapToInt(num -> num)
                .sum();

        System.out.println("Sum  :- " + sum);
    }

    private static void avg() {
        double avg = ResourceLoader.getInts()
                .stream()
                .mapToInt(num -> num)
                .average()
                .getAsDouble();

        System.out.println("Avg  :- " + avg);
    }

    private static void stats() {

        DoubleSummaryStatistics stats =  ResourceLoader.getCars()
                .stream()
                .mapToDouble(car -> Double.parseDouble(car.getPrice()))
                .summaryStatistics();

        System.out.println("Stats :- " + stats);
    }

    private static void min(){
        int min = ResourceLoader.getInts()
                .stream()
                .mapToInt(num -> num)
                .min()
                .getAsInt();

        System.out.println("Min :- " + min);
    }

    private static void max() {

        int max = ResourceLoader.getInts()
                .stream()
                .mapToInt(num -> num)
                .max()
                .getAsInt();
        System.out.println("Max  :- " + max);
    }


}
