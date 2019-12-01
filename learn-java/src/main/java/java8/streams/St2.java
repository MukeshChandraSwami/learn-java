package java8.streams;

import java8.beans.Person;
import java8.utils.ResourceLoader;

import java.util.List;
import java.util.stream.IntStream;

public class St2 {

    public static void main(String[] args) {
         printPeopleUsingIntStream();
    }

    private static void printPeopleUsingIntStream(){

        List<Person> persons = ResourceLoader.getPersons();

        IntStream.range(0,persons.size()).forEach(p -> System.out.println(persons.get(p)));
    }
}
