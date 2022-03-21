package java14.instanceOf;

import java14.beans.Car;
import java14.beans.Person;
import java14.utils.ResourceLoader;

import java.util.Random;

public class InstanceOfPatternMatchingExample {

    public static void main(String[] args) {

        Object ob = getSomething(new Random().nextInt(5));
        if(ob instanceof String s && s.length() > 4) {
            System.out.println(s);
        } else if(ob instanceof Integer i && i %2 == 0) {
            System.out.println("Its a even integer number");
        } else if(ob instanceof Car c) {
            System.out.println(c);
        } else if(ob instanceof Person p) {
            System.out.println(p);
        } else {
            System.out.println("Its super object");
        }
    }

    private static Object getSomething(int choice) {
        return switch (choice) {
            case 1 -> "Pattern matching instanceof example";
            case 2 -> 20;
            case 3 -> new Car();
            case 4 -> ResourceLoader.getPersons().stream().findFirst().get();
            default -> new Object();
        };
    }
}
