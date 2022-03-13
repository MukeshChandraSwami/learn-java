package java8.v1.streams;

import java8.v1.beans.Car;
import java8.v1.beans.PersonDto;
import java8.utils.ResourceLoader;
import java8.utils.ShowOutput;

import java.util.List;
import java.util.stream.Collectors;

public class St5 {

    public static void main(String[] args) {

        // filterCarsByPrice(10000.00F);

        // mapPerson();

        getAvgPriceOfCars();
    }

    private static void filterCarsByPrice(float price){

        List<Car> cars = ResourceLoader.getCars()
                .stream()
                .filter(car -> (Float.parseFloat(car.getPrice()) < price && !car.getColor().equals("Orange")))
                .collect(Collectors.toList());

        ShowOutput.printCars(cars);
    }

    private static void mapPerson(){

        ResourceLoader.getPersons()
                .stream()
                .map(person -> new PersonDto(person.getId(), person.getFirstName() + " " + person.getLastName(),person.getAge()))
                .filter(person -> person.getAge() <= 5)
                .forEach(System.out::println);
    }

    private static void getAvgPriceOfCars(){

        double avg = ResourceLoader.getCars()
                .stream()
                .filter(car -> Double.parseDouble(car.getPrice()) <= 10000)
                .mapToDouble(car -> Double.parseDouble(car.getPrice()))
                .average()
                .getAsDouble();

        System.out.println("Average price of car : " + avg);
    }
}
