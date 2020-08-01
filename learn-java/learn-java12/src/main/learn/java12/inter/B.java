package main.learn.java12.inter;

public interface B {
    default void method () {
        System.out.println("Interface B");
    }
}
