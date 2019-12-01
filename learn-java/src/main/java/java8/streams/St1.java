package java8.streams;

import java8.beans.Person;
import java8.utils.ResourceLoader;
import java8.utils.ShowOutput;

import java.util.List;
import java.util.stream.Collectors;

public class St1 {

    public static void main(String[] args) {
        peopleAgeLessOrEqual18();
    }

    private static void peopleAgeLessOrEqual18(){

       List<Person> personList =  ResourceLoader.getPersons()
               .stream()
               .filter(p -> p.getAge() <= 18)
               .limit(10)
               .collect(Collectors.toList());
        ShowOutput.printPerson(personList);
    }
}
