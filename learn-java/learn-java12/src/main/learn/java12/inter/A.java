package main.learn.java12.inter;

public interface A {
    default void method () {
        System.out.println("Interface A");
    }
}
