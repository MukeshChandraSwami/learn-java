package java8.v2.streams.grouping_by;

import java8.utils.ResourceLoader;
import java8.utils.ShowOutput;
import java8.v1.beans.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBySingleArg {

    public static void main(String[] args) {

        // groupPersonsByGender();

        // groupByAgeCategory();


    }

    private static void groupByAgeCategory() {
        Map<String, List<Person>> collect = ResourceLoader.getPersons().stream()
                .limit(20)
                .collect(Collectors.groupingBy(p -> p.getAge() < 19 ? "TEEN AGER(S)" : p.getAge() < 40 ? "YOUTH(S)" : "OLD(S)"));

        collect.forEach((s,p) -> {
            System.out.println(s);
            ShowOutput.printPerson(p);
        });
    }

    private static void groupPersonsByGender() {

        Map<String, List<Person>> collect = ResourceLoader.getPersons().stream()
                .limit(20)
                .collect(Collectors.groupingBy(Person::getGender));

        collect.forEach((s,p)-> {
            System.out.println("All persons of gender " + s + "\n");
            ShowOutput.printPerson(p);
        });
    }
}
