package main.learn.java12.impl;

import main.learn.java12.inter.A;
import main.learn.java12.inter.B;

public class ImplClass implements A {

    public static void main(String[] args) {
        A a = new ImplClass();
        a.method();
    }
}
