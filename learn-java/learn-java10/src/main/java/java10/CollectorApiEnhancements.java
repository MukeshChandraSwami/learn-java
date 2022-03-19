package java10;

import java10.beans.Person;
import java10.utils.ResourceLoader;

import java.util.stream.Collectors;

public class CollectorApiEnhancements {

    public static void main(String[] args) {

        // toUnmodifiableList()
        var cars = ResourceLoader.getCars().stream()
                .filter(car -> car.getColor().equalsIgnoreCase("red"))
                .limit(3)
                .collect(Collectors.toUnmodifiableList());

        // cars.add(new Car());  It is an unmodifiable collection so this will through exception.
        cars.forEach(c -> System.out.println("Model: " + c.getModel() + " Price: " + c.getPrice()));

        // toUnmodifiableMap()
        var persons = ResourceLoader.getPersons().stream()
                .filter(p -> p.getGender().equalsIgnoreCase("male"))
                .limit(4)
                .collect(Collectors.toUnmodifiableMap(Person::getId, Person::getFirstName));
        persons.forEach((k,v) -> System.out.println("Id: " + k + " Name: " + v));

        //toUnmodifiableSet()
        var uniquePersons = ResourceLoader.getPersons().stream()
                .filter(p -> p.getGender().equalsIgnoreCase("male"))
                .limit(4)
                .collect(Collectors.toUnmodifiableSet());
    }
}
