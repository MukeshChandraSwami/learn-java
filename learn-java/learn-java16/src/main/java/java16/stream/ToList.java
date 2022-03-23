package java16.stream;

import java16.beans.Car;
import java16.utils.ResourceLoader;

import java.util.List;
import java.util.stream.Collectors;

public class ToList {

    public static void main(String[] args) {
        // Old approach to get a list of output of stream processing
        List<Car> redCars1 = ResourceLoader.getCars().stream()
                .filter(c -> c.getColor().equalsIgnoreCase("red"))
                .collect(Collectors.toList());

        // New approach to get a list of output of stream processing
        List<Car> redCars2 = ResourceLoader.getCars().stream()
                .filter(c -> c.getColor().equalsIgnoreCase("red"))
                .toList();

        System.out.println("List1 size:- " + redCars1.size());
        System.out.println("List2 size:- " + redCars2.size());
    }
}
