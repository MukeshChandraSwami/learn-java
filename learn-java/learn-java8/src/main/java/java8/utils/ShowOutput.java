package java8.utils;

import java8.v1.beans.Car;
import java8.v1.beans.Person;

import java.util.List;

public class ShowOutput {

    public static void printPerson(List<Person> persons){
        persons.forEach((p) -> {
            System.out.println("First Name :- " + p.getFirstName() + " :: Last Name :- " + p.getLastName()
            + " :: Age :- " + p.getAge() + " :: Gender :- " + p.getGender());
        });
    }

    public static void printCars(List<Car> cars){
        cars.forEach(c -> {
            System.out.println("Make :- " + c.getMake() + " :: Model :- " + c.getModel() + " :: price :- " + c.getPrice()
            + " :: Year :- " + c.getYear() + " :: Color :- " + c.getColor());
        });
    }
}
